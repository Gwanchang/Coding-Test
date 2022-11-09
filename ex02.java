import java.util.Arrays;

class Solution {
    public static String[] solution(int n, long[] arr1, long[] arr2) {
    	int length = arr1.length;
    	String[] path1 = new String[length];
    	String[] path2 = new String[length];
    	String[] answer = new String[length];
    	for ( int i = 0; i < length; i++ ) {
    		answer[i] = "";
    		path1[i] = Long.toBinaryString(arr1[i]);
    		path2[i] = Long.toBinaryString(arr2[i]);
    		while ( path1[i].length() != n ) {
    			path1[i] = "0" + path1[i];
    		}
    		
    		while ( path2[i].length() != n ) {
    			path2[i] = "0" + path2[i];
    		}
    		
    		for ( int j = 0; j < path1[i].length(); j++ ) {
    			if ( path1[i].charAt(j) == '1' || path2[i].charAt(j) == '1' )
    				answer[i] += "#";
    			else
    				answer[i] += " ";
    		}
    		
    	}
    	for ( String s : answer )
    		System.out.println(s);
        return answer;
    }
}

public class ex02 {
	public static void main(String[] args) {
		long[] arr1 = {46, 33, 33 ,22, 31, 50};
		long[] arr2 = {27 ,56, 19, 14, 14, 10};
		System.out.println(Solution.solution(6, arr1, arr2)); 
	}
}
