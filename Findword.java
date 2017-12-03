import java.io.*;
import java.util.*;

public class SpellCheck_findWord {
	String filePath = "C:\\Users\\Κατερίνα\\Desktop\\le3eis.txt";
	BufferedReader br;
	String l="";
	char[] letters= {'α','ά','β','γ','δ','ε','έ','ζ','η','ή','θ','ι','ί','ϊ','ΐ','κ','λ','μ','ν','ξ','ο','ό','π','ρ','σ','τ','υ','ύ','ϋ','ΰ','φ','χ','ψ','ω','ώ'};

	public boolean findWord(String lexi) {
		try {
		    br = new BufferedReader(new FileReader(filePath));
		    try {
		    	while((l = br.readLine()) != null) {
		    		String[] words = l.split(" ");
		    		for (String word : words) {
		                  if (word.equals(lexi)) {
		                	  return true;
				            }
		              }
		         }
		    	br.close();
		    }
		    catch (FileNotFoundException e) {
			        e.printStackTrace();
		    }
		}
		    catch (IOException e) {
		        e.printStackTrace();
		    }
		return false;
	}



}




