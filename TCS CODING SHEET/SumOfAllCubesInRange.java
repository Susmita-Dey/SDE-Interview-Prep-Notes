import java.util.*;

public class SumOfAllCubesInRange {
	public static int sumOfCubes(int n, int m) {
		int sum = 0;
		for (int i = n; i <= m; i++) {
			sum += i * i * i;
		}
		return sum;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int res = sumOfCubes(n, m);
		System.out.println(res);
		sc.close();
	}
}