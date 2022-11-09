import java.util.OptionalDouble;
import java.util.stream.IntStream;

class Solution01 {
	public static int solution(int n) {
        if ( n == 0 ) return 0;
        int s = n % 10;
        n = (n - s) / 10;
        return s + solution(n);
        
    }
}


public class ex04 {
	public static void main(String[] args) {
		int a = 987;
		System.out.println(Solution01.solution(a));
	}
	
}
