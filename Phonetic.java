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
	private final static char B='â';
	private final static char K='ê';
	private final static char L='ë';
	private final static char M='ì';
	private final static char N='í';
	private final static char P='ð';
	private final static char R='ñ';
	private final static char S='ó';
	private final static char T='ô';

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
			case 'á':
			case 'Ü':
				if(letter < letters.length - 1) {
					if(letters[letter]=='á' && (letters[letter+1]=='é' || letters[letter+1]=='ß')) {
						new_word[new_letter] = E;
						letter++;
						new_letter++;
						count++;
						break;
					}
					if(letters[letter]=='á' && (letters[letter+1]=='õ' || letters[letter+1]=='ý' || letters[letter+1]=='â' || letters[letter+1]=='ö')) {
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
			case 'å':
			case 'Ý':
				if(letter < letters.length - 1) {
					if(letters[letter]=='å' && (letters[letter+1]=='é' || letters[letter+1]=='ß')) {
						new_word[new_letter] = I;
						letter++;
						new_letter++;
						count++;
						break;
					}

					if(letters[letter]=='å' && (letters[letter+1]=='õ' || letters[letter+1]=='ý' || letters[letter+1]=='â' || letters[letter+1]=='ö')) {
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
			case 'é':
			case 'ß':
			case 'ú':
			case 'À':
			case 'ç':
			case 'Þ':
			case 'õ':
			case 'ý':
			case 'û':
			case 'à':
				new_word[new_letter] = I;
				new_letter++;
				break;
			case 'ï':
			case 'ü':
			case 'ù':
			case 'þ':
				if(letter < letters.length - 1) {
					if(letters[letter]=='ï' && (letters[letter+1]=='é' || letters[letter+1]=='ß')) {
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
			case 'ã':
				if(letter < letters.length - 1) {
					if(letters[letter]=='ã' && (letters[letter+1]=='ê' || letters[letter+1]=='ã')) {
						new_word[new_letter] = G;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case 'â':
				if(letter < letters.length - 1) {
					if(letters[letter]=='â' && letters[letter+1]=='â') {
						new_word[new_letter] = B;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case 'ê':
				if(letter < letters.length - 1) {
					if(letters[letter]=='ê' && letters[letter+1]=='ê' ) {
						new_word[new_letter] = K;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case 'ë':
				if(letter < letters.length - 1) {
					if(letters[letter]=='ë' && letters[letter+1]=='ë') {
						new_word[new_letter] = L;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case 'ì':
				if(letter < letters.length - 1) {
					if(letters[letter]=='ì' && letters[letter+1]=='ì') {
						new_word[new_letter] = M;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case 'í':
				if(letter < letters.length - 1) {
					if(letters[letter]=='í' && letters[letter+1]=='í') {
						new_word[new_letter] = N;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case 'ð':
				if(letter < letters.length - 1) {
					if(letters[letter]=='ð' && letters[letter+1]=='ð') {
						new_word[new_letter] = P;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case 'ñ':
				if(letter < letters.length - 1) {
					if(letters[letter]=='ñ' && letters[letter+1]=='ñ') {
						new_word[new_letter] = R;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}

			case 'ó':
				if(letter < letters.length - 1) {
					if(letters[letter]=='ó' && letters[letter+1]=='ó' ) {
						new_word[new_letter] = S;
						letter++;
						new_letter++;
						count++;
						break;
					}
				}


			case 'ô':
				if(letter < letters.length - 1) {
					if(letters[letter]=='ô' && letters[letter+1]=='ô') {
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

