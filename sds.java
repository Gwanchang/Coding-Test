class Solution2 {
  public static String[] solution(int n, int[] arr1, int[] arr2) {
      String[] answer = new String[n];
      String temp;

      for(int i = 0 ; i < n ; i++){
          temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
          temp = temp.substring(temp.length() - n);
          temp = temp.replaceAll("1", "#");
          temp = temp.replaceAll("0", " ");
          answer[i] = temp;
      }

      return answer;
  }
}



public class sds {

	public static void main(String[] args) {
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		Solution2.solution(6, arr1, arr2);

	}

}
