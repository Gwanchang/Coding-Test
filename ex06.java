class A02 {
	public static String a (String s) {
		String answer = "";
		s = s.toLowerCase();
		String[] words = s.split(" ");
		for ( int i = 0; i < words.length; i++ ) {
			words[i].replace(words[i].substring(0, 1), words[i].substring(0, 1).toUpperCase());
			System.out.println(words[i]);
		}
		
        return answer;
	}
}


public class ex06 {

	public static void main(String[] args) {
		String s = "for the last week ";
		System.out.println(A02.a(s));
		
	}

}
