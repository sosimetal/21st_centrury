import java.io.*;
import java.util.*;

public class SpellCheck_findWord {
	String filePath = "C:\\Users\\��������\\Desktop\\le3eis.txt";
	BufferedReader br;
	String l="";
	char[] letters= {'�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�'};

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




