package Day03;

import java.util.Scanner;

public class Ex12_Star2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= (N+1)-i; j++) {
				// i : 1, j : 1,2,3,4,5
				// i : 2, j : 1,2,3,4
				// i : 3, j : 1,2,3
				// i : 4, j : 1,2
				// i : 5, j : 1
				// 1 2 3 4 5 : i
				// 5 4 3 2 1 : 6-i
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	
}





