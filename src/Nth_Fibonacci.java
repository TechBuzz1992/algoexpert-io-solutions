
public class Nth_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nth_fibonacci(1));

	}
	
	public static int nth_fibonacci(int n) {
		int[] mem = new int[6];
		mem[0] = 0;
		mem[1] = 1;
		for(int i = 2;i<n;i++) {
			mem[i] = mem[i-1] + mem[i-2];
		}
		return mem[n-1];
	}

}
