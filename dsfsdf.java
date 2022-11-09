import java.util.Arrays;
import java.util.Collections;

class A01 {
	public static long s(long n) {
        long answer = 0;
        String[] s = String.valueOf(n).split("");
        String sort = "";
        Arrays.sort(s, Collections.reverseOrder());
        for ( int i = 0; i < s.length; i++ ) {
        	sort += s[i];
        }  
        answer = Long.valueOf(sort);
        
        return answer;
    }
}


public class dsfsdf {

	public static void main(String[] args) {
		long n = 118372;
		System.out.println(A01.s(n));

	}

}
