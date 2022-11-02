package tema6;

public class Homework2 {

	public static void main(String[] args) {
		int countVocale = 0;
		String text = "Eu invat Java";
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
				countVocale++;
			}
		}
		
		System.out.println("Vocale: " + countVocale);

	}

}
