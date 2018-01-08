import java.io.*;
import java.util.*;

public class SpellCheck {
	String filePath = "C:\\Users\\Κατερίνα\\Desktop\\le3eis.txt";

	BufferedReader br;
	String l="";
	char[] letters= {'α','ά','β','γ','δ','ε','έ','ζ','η','ή','θ','ι','ί','ϊ','ΐ','κ','λ','μ','ν','ξ','ο','ό','π','ρ','σ','τ','υ','ύ','ϋ','ΰ','φ','χ','ψ','ω','ώ'};
	public static List<String> dict = new ArrayList<String>();

	public void dictionary() {
		try {

			List<String> test = new ArrayList<String>();
		    br = new BufferedReader(new FileReader(filePath));
		    try {
		    	while((l = br.readLine()) != null) {
		    		String[] words = l.split(" ");
		    		for (String word : words) {
		    			test.add(word);
		              }
		         }

		    	dict=test;
		    	br.close();

		    }
		    catch (FileNotFoundException e) {
			        e.printStackTrace();
		    }
		}
		    catch (IOException e) {
		        e.printStackTrace();
		    }
	}

	public String removePun(String input) {
		String strippedInput = input.replaceAll("\\p{Punct}|\\d", "");
		System.out.println("Your string: " + strippedInput);
		return strippedInput;
	}

	public boolean findWord(String lexi) {
		if(dict.contains(lexi)) {
			return true;
		} else {
			return false;
		}
	}


	public ArrayList<String> letterLess(String lexi){
		ArrayList<String> suggest = new ArrayList<>();
		for (int i = 0; i <lexi.length(); i++) {
            for(char letter:letters) {
            	String word = lexi.substring(0, i);
            	word = word + letter;
            	word = word.concat(lexi.substring(i));
            	if (findWord(word)) {
                	suggest.add(word);
                }
            }
		}

		return suggest;
	}

	public ArrayList<String> letterPlus(String lexi) {
        ArrayList<String> suggest = new ArrayList<>();
        for (int i = 0; i < lexi.length() - 1; i++) {
            String word = lexi.substring(0, i);
            word = word + lexi.charAt(i + 1);
            word = word.concat(lexi.substring((i + 2)));

            if (findWord(word)) {
            	suggest.add(word);
            }
        }
        return suggest;
    }

	public ArrayList<String> wrongLetter(String lexi){
		ArrayList<String> suggest = new ArrayList<>();
		for (int i = 0; i < lexi.length(); i++) {
            for(char letter:letters) {
            	String word = lexi.substring(0, i);
            	word = word + letter;
            	word = word.concat(lexi.substring(i+1));
            	if (findWord(word)) {
                	suggest.add(word);
                }
            }
		}
		return suggest;
	}

    public ArrayList<String> lettersSwapped(String lexi) {
        ArrayList<String> suggest = new ArrayList<>();

        for (int i = 0; i < lexi.length() - 1; i++) {
            String word = lexi.substring(0, i);
            word = word + lexi.charAt(i + 1);
            word = word + lexi.charAt(i);
            word = word.concat(lexi.substring((i + 2)));

            if (findWord(word)) {
            	suggest.add(word);
            }
        }
        return suggest;
    }

    public ArrayList<String> phonetic(String lexi){
		ArrayList<String> suggest = new ArrayList<>();
		Phonetic ph=new Phonetic();
		ph.codeDictionary();
		String code = Phonetic.toCode(lexi);
		suggest=Phonetic.getOriginalByCode(code);
		return suggest;
	}


    public ArrayList<String> suggestions(String lexi) {
        ArrayList<String> suggest = new ArrayList<>();
        suggest.addAll(phonetic(lexi));
        suggest.addAll(letterLess(lexi));
        suggest.addAll(letterPlus(lexi));
        suggest.addAll(wrongLetter(lexi));
        suggest.addAll(lettersSwapped(lexi));
        /*Εξασφαλίζει ότι δεν θα υπάρχουν ίδιες προτάσεις*/
        Set<String> hs = new HashSet<>();
        hs.addAll(suggest);
        suggest.clear();
        suggest.addAll(hs);
        return suggest;
    }

}




