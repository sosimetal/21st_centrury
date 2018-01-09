import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SpellCheckTest {

	public Spellcheck test = new Spellcheck();

	@Test
	public void testFindWord() {
		Spellcheck sc=new Spellcheck();
		Phonetic ph=new Phonetic();
		ph.codeDictionary();
		sc.dictionary();
		boolean output=test.findWord("�����");
		assertEquals(true,output);
	}


	@Test
	public void testLetterPlus() {
		Spellcheck sc=new Spellcheck();
		Phonetic ph=new Phonetic();
		ph.codeDictionary();
		sc.dictionary();
		ArrayList<String> output2=new ArrayList<String>();
		output2 = test.letterPlus("�����");
		ArrayList<String> output22=new ArrayList<String>();
		output22.add("����");
		assertArrayEquals( output22.toArray(),output2.toArray());
	}
	@Test
	public void testLetterLess(){
		Spellcheck sc= new Spellcheck();
		Phonetic ph=new Phonetic();
		ph.codeDictionary();
		sc.dictionary();
		ArrayList<String> output1=new ArrayList<>();
		output1 = test.letterLess("��");
		ArrayList<String> output11=new ArrayList<>();
		output11.add("���");
		output11.add("���");
		output11.add("���");
		assertArrayEquals( output11.toArray(),output1.toArray());



	}
	@Test
	public void testSuggestions(){
		Spellcheck sc= new Spellcheck();
		Phonetic ph=new Phonetic();
		ph.codeDictionary();
		sc.dictionary();
		ArrayList<String> output7=new ArrayList<>();
		output7 = test.suggestions("��");
		ArrayList<String> output77=new ArrayList<>();
		output77.add("��");
		output77.add("���");
		output77.add("��");
		output77.add("��");
		output77.add("���");
		output77.add("��");
		output77.add("��");
		output77.add("��");
		output77.add("���");
		assertArrayEquals( output77.toArray(),output7.toArray());

	}
@Test
public void testWrongLetter(){
	Spellcheck sc= new Spellcheck();
	Phonetic ph=new Phonetic();
	ph.codeDictionary();
	sc.dictionary();
	ArrayList<String> output3=new ArrayList<>();
	output3 = test.wrongLetter("����");
	ArrayList<String> output33=new ArrayList<>();
	output33.add("����");
    assertArrayEquals( output33.toArray(),output3.toArray());

}

@Test
public void testLettersSwapped(){
	Spellcheck sc= new Spellcheck();
	Phonetic ph=new Phonetic();
	ph.codeDictionary();
	sc.dictionary();
	ArrayList<String> output4=new ArrayList<>();
	output4 = test.lettersSwapped("�����");
	ArrayList<String> output44=new ArrayList<>();
	output44.add("�����");
    assertArrayEquals( output44.toArray(),output4.toArray());

}

@Test
public void testPhonetic(){
	Spellcheck sc= new Spellcheck();
	sc.dictionary();
	ArrayList<String> output6=new ArrayList<>();
	output6= test.phonetic("����");
	ArrayList<String> output66=new ArrayList<>();
	output66.add("����");
    assertArrayEquals( output66.toArray(),output6.toArray());
}
}

