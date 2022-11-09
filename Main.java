import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		for ( int a : m.result())
			System.out.print(a + " ");
		
	}
	
	public int[] result() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int f=0,b=0;
		String s = st.nextToken();
		String t = st.nextToken();
		int[] route = new int[s.length()];
		char[] c = s.toCharArray();
		for ( int i = 0; i < c.length; i++ ) {
			for ( int j = i; j < c.length; j++ ) {
				if ( t.charAt(0) == c[j] )
					break;
				else 
					f++;
			}
			for ( int j = i; j >= 0; j-- ) {
				if ( t.charAt(0) == c[j] )
					break;
				else 
					b++;
			}
			if ( f < b ) {
				route[i] = f;
				f = 0; b = 0;
			} else {
				route[i] = b;
				f = 0; b = 0;
			}
				
		}
		return route;
	}

}
