import java.io.*;
import java.util.*;

public class Suggestions {
	String filePath = "C:\\Users\\��������\\Desktop\\le3eis.txt";
	BufferedReader br;
	String l="";
	char[] letters= {'�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�'};

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

