import java.util.Arrays;
import java.util.Iterator;

class Solution02 {
    public static boolean solution(String s) {
        int peat = 0;
        
        for ( char c : s.toLowerCase().toCharArray() )
        	if ( c=='p' || c=='y') peat++;
        System.out.println("peat = " + (peat % 2 == 0));
//        return peat % 2 == 0;
    	
    	int peatP = 0;
        int peatY = 0;
        for ( char c : s.toLowerCase().toCharArray() ) {
            if ( c == 'p' ) peatP++;
            if ( c == 'y' ) peatY++;
        }
        System.out.println("peatP = " + peatP + " || peatY = " + peatY);	
        
        return peatP == peatY;
        
    }
}


public class ex05 {

	public static void main(String[] args) {
		String s = "ppyy";
		System.out.println(Solution02.solution(s));
		
	}

}
