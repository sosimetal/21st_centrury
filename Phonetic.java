import java.util.ArrayList;
import java.util.List;

public class Phonetic {
	protected String original_word;
	protected String code_word;
	SpellCheck sc = new SpellCheck();
	public static List<String> dictionary = new ArrayList<String>();
	public static List<Phonetic> phonetic = new ArrayList<Phonetic>();
	private final static char A='1';
	private final static char E='2';
	private final static char I='3';
	private final static char O='4';
	private final static char G='5';
	private final static char W='6';
	private final static char Q='7';
	private final static char B='�';
	private final static char K='�';
	private final static char L='�';
	private final static char M='�';
	private final static char N='�';
	private final static char P='�';
	private final static char R='�';
	private final static char S='�';
	private final static char T='�';

	public Phonetic() {}

	public Phonetic(String original_word, String code_word) {
		this.original_word=original_word;
		this.code_word=code_word;
	}


	public String getOriginalWord() {
		return original_word;
	}

	public String getCodeWord() {
		return code_word;
	}

	public void codeDictionary() {
		dictionary = SpellCheck.dict;
		sc.dictionary();
		for(int i=0; i<dictionary.size(); i++) {
			String lexi = dictionary.get(i);
			code_word = toCode(lexi);
			phonetic.add(new Phonetic(lexi, code_word));
		}
	}

	public static ArrayList<String> getOriginalByCode(String code) {
		ArrayList<String> suggests = new ArrayList<String>();
		for(int i=0; i<phonetic.size();i++) {
			if(code.equals(phonetic.get(i).getCodeWord())) {
				String original=phonetic.get(i).getOriginalWord();
				suggests.add(original);
			}
		}
		return suggests;
	}

	public static String toCode(String lexi) {
		char[] letters = lexi.toCharArray();
		char[] new_word = new char[letters.length];
		int new_letter = 0;
		int count = 0;

		for(int letter=0; letter < letters.length; letter++) {

		switch(letters[letter]) {
			case '�':
			case '�':
				if(letter < letters.length - 1) {
					if(letters[letter]=='�' && (letters[letter+1]=='�' || letters[letter+1]=='�')) {
						new_word[new_letter] = E;
						letter++;
						new_letter++;
						count++;
						break;
					}
					if(letters[letter]=='�' && (letters[letter+1]=='�' || letters[letter+1]=='�' || letters[letter+1]=='�' || letters[letter+1]=='�')) {
											new_word[new_letter] = W;
											letter++;
											new_letter++;
											count++;
											break;
					}
				}
				new_word[new_letter] = A;
				new_letter++;
				break;
			case '�':
			case '�':
				if(letter < letters.length - 1) {
					if(letters[letter]=='�' && (letters[letter+1]=='�' || letters[letter+1]=='�')) {
						new_word[new_letter] = I;
						letter++;
						new_letter++;
						count++;
						break;
					}

					if(letters[letter]=='�' && (letters[letter+1]=='�' || letters[letter+1]=='�' || letters[letter+1]=='�' || letters[letter+1]=='�')) {
																new_word[new_letter] = Q;
																letter++;
																new_letter++;
																count++;
																break;
					}

				}
				new_word[new_letter] = E;
				new_letter++;
				break;
			case '�':
			case '�':
			case '�':
			case '�':
			case '�':
			case '�':
			case '�':
			case '�':
			case '�':
			case '�':
				new_word[new_letter] = I;
				new_letter++;
				break;
			case '�':
			case '�':
			case '�':
			case '�':
				if(letter < letters.length - 1) {
					if(letters[letter]=='�' && (letters[letter+1]=='�' || letters[letter+1]=='�')) {
						new_word[new_letter] = I;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}
				new_word[new_letter] = O;
				new_letter++;
				break;
			case '�':
				if(letter < letters.length - 1) {
					if(letters[letter]=='�' && (letters[letter+1]=='�' || letters[letter+1]=='�')) {
						new_word[new_letter] = G;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case '�':
				if(letter < letters.length - 1) {
					if(letters[letter]=='�' && letters[letter+1]=='�') {
						new_word[new_letter] = B;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case '�':
				if(letter < letters.length - 1) {
					if(letters[letter]=='�' && letters[letter+1]=='�' ) {
						new_word[new_letter] = K;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case '�':
				if(letter < letters.length - 1) {
					if(letters[letter]=='�' && letters[letter+1]=='�') {
						new_word[new_letter] = L;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case '�':
				if(letter < letters.length - 1) {
					if(letters[letter]=='�' && letters[letter+1]=='�') {
						new_word[new_letter] = M;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case '�':
				if(letter < letters.length - 1) {
					if(letters[letter]=='�' && letters[letter+1]=='�') {
						new_word[new_letter] = N;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case '�':
				if(letter < letters.length - 1) {
					if(letters[letter]=='�' && letters[letter+1]=='�') {
						new_word[new_letter] = P;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case '�':
				if(letter < letters.length - 1) {
					if(letters[letter]=='�' && letters[letter+1]=='�') {
						new_word[new_letter] = R;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case '�':
				if(letter < letters.length - 1) {
					if(letters[letter]=='�' && letters[letter+1]=='�' ) {
						new_word[new_letter] = S;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}


			case '�':
				if(letter < letters.length - 1) {
					if(letters[letter]=='�' && letters[letter+1]=='�') {
						new_word[new_letter] = T;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			default:
				new_word[new_letter] = letters[letter];
				new_letter++;
				break;
		}

	}
	String word = new String(new_word);
	if(count != 0) {
		word = word.substring(0, word.length()-count);
	}
	return word;
	}

}

