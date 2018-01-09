package java2;

import static org.junit.Assert.*;

import java.util.*;


import org.junit.Test;

public class SpellCheckTest {
	public SpellCheck test = new SpellCheck();

	@Test
	public void testFindWord() {
		SpellCheck sc=new SpellCheck();
		Phonetic ph=new Phonetic();
		ph.codeDictionary();
		sc.dictionary();
		boolean output=test.findWord("είναι");
		assertEquals(true,output);
	}


	@Test
	public void testLetterPlus() {
		SpellCheck sc=new SpellCheck();
		Phonetic ph=new Phonetic();
		ph.codeDictionary();
		sc.dictionary();
		ArrayList<String> output2=new ArrayList<String>();
		output2 = test.letterPlus("γράτα");
		ArrayList<String> output22=new ArrayList<String>();
		output22.add("γάτα");
		assertArrayEquals( output22.toArray(),output2.toArray());
	}

	public void testLetterLess(){
		SpellCheck sc= new SpellCheck();
		Phonetic ph=new Phonetic();
		ph.codeDictionary();
		sc.dictionary();
		ArrayList<String> output1=new ArrayList<>();
		output1 = test.letterLess("πό");
		ArrayList<String> output11=new ArrayList<>();
		output11.add("από");
		output11.add("οπό");
		output11.add("υπό");
		output11.add("πόα");
		assertArrayEquals( output11.toArray(),output1.toArray());



	}
	public void testSuggestions(){
		SpellCheck sc= new SpellCheck();
		Phonetic ph=new Phonetic();
		ph.codeDictionary();
		sc.dictionary();
		ArrayList<String> output7=new ArrayList<>();
		output7 = test.suggestions("πό");
		ArrayList<String> output77=new ArrayList<>();
		output77.add("από");
		output77.add("οπό");
		output77.add("υπό");
		output77.add("πόα");
		output77.add("ιό");
		output77.add("ίό");
		output77.add("ωό");
		output77.add("πα");
		output77.add("πι");
		output77.add("πω");
		assertArrayEquals( output77.toArray(),output7.toArray());

	}

}

