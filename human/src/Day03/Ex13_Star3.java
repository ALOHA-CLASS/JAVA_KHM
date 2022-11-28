package Day03;

import java.util.Scanner;

public class Ex13_Star3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 1줄 : 공백0, *5
		// 2줄 : 공백1, *4
		// 3줄 : 공백2, *3
		// 4줄 : 공백3, *2
		// 5줄 : 공백4, *1
		for (int i = 1; i <= N; i++) {
			// i : 1
			// i : 2
			// i : 3
			// i : 4
			// i : 5
			for (int j = 1; j < i; j++) {
				// 공백
				// i : 1, j : x
				// i : 2, j : 1
				// i : 3, j : 1 2
				// i : 4, j : 1 2 3
				// i : 5, j : 1 2 3 4
				System.out.print(" ");
			}
			
			for (int k = 1; k <= (N+1)-i; k++) {
				// "*"
				// i : 1, k : 1 2 3 4 5
				// i : 2, k : 1 2 3 4
				// i : 3, k : 1 2 3
				// i : 4, k : 1 2
				// i : 5, k : 1
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
}



