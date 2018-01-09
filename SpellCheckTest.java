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
		boolean output=test.findWord("�����");
		assertEquals(true,output);
	}


	@Test
	public void testLetterPlus() {
		SpellCheck sc=new SpellCheck();
		Phonetic ph=new Phonetic();
		ph.codeDictionary();
		sc.dictionary();
		ArrayList<String> output2=new ArrayList<String>();
		output2 = test.letterPlus("�����");
		ArrayList<String> output22=new ArrayList<String>();
		output22.add("����");
		assertArrayEquals( output22.toArray(),output2.toArray());
	}

	public void testLetterLess(){
		SpellCheck sc= new SpellCheck();
		Phonetic ph=new Phonetic();
		ph.codeDictionary();
		sc.dictionary();
		ArrayList<String> output1=new ArrayList<>();
		output1 = test.letterLess("��");
		ArrayList<String> output11=new ArrayList<>();
		output11.add("���");
		output11.add("���");
		output11.add("���");
		output11.add("���");
		assertArrayEquals( output11.toArray(),output1.toArray());



	}
	public void testSuggestions(){
		SpellCheck sc= new SpellCheck();
		Phonetic ph=new Phonetic();
		ph.codeDictionary();
		sc.dictionary();
		ArrayList<String> output7=new ArrayList<>();
		output7 = test.suggestions("��");
		ArrayList<String> output77=new ArrayList<>();
		output77.add("���");
		output77.add("���");
		output77.add("���");
		output77.add("���");
		output77.add("��");
		output77.add("��");
		output77.add("��");
		output77.add("��");
		output77.add("��");
		output77.add("��");
		assertArrayEquals( output77.toArray(),output7.toArray());

	}

}

