import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

class Solution4 {
    public static int solution(Integer[] d, int budget) {
        int answer = 0;
        Arrays.sort(d, Collections.reverseOrder());
        for ( int i = 0; i < d.length; i++ ) {
        	System.out.println( "d[i] = " + d[i]);
        }
        
        return answer;
    }
    
}
public class ex03 {
	public static void main(String[] args) {
		Integer[] d = {3 ,2 ,4, 5, 1};
		Integer[] d1 = {2, 2, 3, 3};
		System.out.println(Solution4.solution(d, 16));
		System.out.println(Solution4.solution(d1, 10));
		
	}
}
