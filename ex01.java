import java.util.stream.IntStream;

public class ex01 {
	static class Run {
		public static int sumNum (int[] a, int[] b) {
			int sum = 0;
			for ( int i = 0; i < a.length; i++ ) {
				sum += a[i]*b[i];
			}
			sum = IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
			
			return sum;
		}
	}
	
	public static void main(String[] args) {
		int[] a = {-1,0,1};
		int[] b = {1,0,1};
		
		System.out.println(Run.sumNum(a, b));
	}
}