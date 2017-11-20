import java.io.*;
import java.util.*;

public class Suggestions {
	String filePath = "C:\\Users\\Κατερίνα\\Desktop\\le3eis.txt";
	BufferedReader br;
	String l="";
	char[] letters= {'α','ά','β','γ','δ','ε','έ','ζ','η','ή','θ','ι','ί','ϊ','ΐ','κ','λ','μ','ν','ξ','ο','ό','π','ρ','σ','τ','υ','ύ','ϋ','ΰ','φ','χ','ψ','ω','ώ'};

 public ArrayList<String> suggestions(String lexi) {
        ArrayList<String> suggest = new ArrayList<>();
        suggest.addAll(letterLess(lexi));
        suggest.addAll(letterPlus(lexi));
        suggest.addAll(wrongLetter(lexi));
        suggest.addAll(lettersSwapped(lexi));
        suggest.addAll(wrongAccent(lexi));
        return suggest;
    }
}

