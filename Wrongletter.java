import java.io.*;
import java.util.*;

public class Wrongletter {
	String filePath = "C:\\Users\\��������\\Desktop\\le3eis.txt";
	BufferedReader br;
	String l="";
	char[] letters= {'�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�'};

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
}