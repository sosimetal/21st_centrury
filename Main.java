/*Compile with javac - encoding cp1253 Main.java*/

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException
	{
		SpellCheck sc=new SpellCheck();
		Phonetic ph=new Phonetic();
		ph.codeDictionary();
		sc.dictionary();
		System.out.println("Γράψε μία πρόταση:");
		String line = null;
		InputStreamReader isr = null;
		try{
			isr = new InputStreamReader(System.in, "Cp737");
			BufferedReader keyboard = new BufferedReader(isr);
			line = keyboard.readLine();
	    	PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "Cp737"), true);
		} catch (Exception e) {}
		finally{
			if(isr!=null) {
				isr.close();
	      	}
		}
		System.out.println();
        line = sc.removePun(line);
        line = line.toLowerCase();
        String arr[] = line.split(" ");

        int wrong_words=0;


        for (int i = 0; i < arr.length; i++) {
        	if(sc.findWord(arr[i])==false) {
        		if(sc.suggestions(arr[i]).isEmpty()) {
        			System.out.println(arr[i] + " : Λυπούμαστε αλλά αυτή η λέξη δεν υπάρχει στο λεξικό μας.");
        			wrong_words=1;
        		} else {
        			System.out.println(arr[i] + " : Λάθος --- Πιθανές Λέξεις:" + sc.suggestions(arr[i]));
        			wrong_words++;
        		}
        }
	}
        if(wrong_words==0)
        {
        	System.out.println("Δεν βρέθηκαν λάθη.");
        }
	}


}
