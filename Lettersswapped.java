import java.io.*;
import java.util.*;

public class SpellCheck_lettersswapped {
	String filePath = "C:\\Users\\Κατερίνα\\Desktop\\le3eis.txt";
	BufferedReader br;
	String l="";
	char[] letters= {'α','ά','β','γ','δ','ε','έ','ζ','η','ή','θ','ι','ί','ϊ','ΐ','κ','λ','μ','ν','ξ','ο','ό','π','ρ','σ','τ','υ','ύ','ϋ','ΰ','φ','χ','ψ','ω','ώ'};
	
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