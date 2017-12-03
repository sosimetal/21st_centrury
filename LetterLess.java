import java.io.*;
import java.util.*;

public class SpellCheck_letterLess {
	String filePath = "C:\\Users\\Κατερίνα\\Desktop\\le3eis.txt";
	BufferedReader br;
	String l="";
	char[] letters= {'α','ά','β','γ','δ','ε','έ','ζ','η','ή','θ','ι','ί','ϊ','ΐ','κ','λ','μ','ν','ξ','ο','ό','π','ρ','σ','τ','υ','ύ','ϋ','ΰ','φ','χ','ψ','ω','ώ'};
	
	
public ArrayList<String> letterLess(String lexi){
		ArrayList<String> suggest = new ArrayList<>();
		for (int i = 0; i < lexi.length(); i++) {
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