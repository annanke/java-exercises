package pl.edu.agh.java.exercises.strings;

/**
 * Given a string, return the longest substring that appears at both the
 * beginning and end of the string without overlapping. For example,
 * sameEnds("abXab") is "ab".
 * <p>
 * Dla danego ciągu znaków zwróć najdłuższy podciąg, który występuje na początku
 * i na końcu, bez nachodzenia na siebie. Przykłądowo, sameEnds("abXab") to
 * "ab".
 *
 * @see http://codingbat.com/prob/p131516
 */
public class StringSameEnds {
	public String sameEnds(String string) {
		//throw new UnsupportedOperationException();
		System.out.println("string: "+string);
		String substr="";
		int i=0;
		boolean found=false;
		if (string==null || string=="") {
			return substr;
		}else {
			while(!found || i<=((string.length()/2)-i)) {
				substr= string.substring(0,(string.length()/2)-i);
				System.out.println("substring: "+substr);
				if (string.lastIndexOf(substr)!=0) {
					found =true;
				}
				i++;
				
			}
		}
/*		System.out.println("string: "+string);
		String substring="";
		for (int i=0; i<(string.length()/2); i++) {
			String a= string.substring(i,i+1);
			System.out.println("a: "+a);
			String b=string.substring(string.length()-1-i, string.length()-i);
			System.out.println("b: "+b);
			if (a.equals(b)) {
				substring=substring+string.substring(i,i+1);
				System.out.println(i+" substring: "+substring);
			}else {
				break;
			}
		}*/
		return substr;
	}
}
