package Day03;

import java.util.Scanner;

public class Ex11_Star1 {
	
	public static void main(String[] args) {
		// 자연수 N을 입력받아, 삼각형 모양의 "*" 출력하시오.
		// 입력 : 5
		// 출력 :
		// *
		// **
		// ***
		// ****
		// *****
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				// i : 1, j : 1
				// i : 2, j : 1 2
				// i : 3, j : 1 2 3 
				// i : 4, j : 1 2 3 4
				// i : 5, j : 1 2 3 4 5
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
