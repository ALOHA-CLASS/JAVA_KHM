package MS06;

import java.util.Arrays;
import java.util.Scanner;

/*
 	1. "몇 게임? " 출력
	2. 정수 N 입력
	3. N번 반복
	  - 1~45 사이의 랜덤수
	  - 6번 반복
	    중복 체크하면서, 
	    6개의 랜덤수를 배열에 저장
	
	  - 배열을 정렬 (오름차순)
	  
	  - 총 N개의 배열을 순서대로 출력
 */
public class Lottoria {
	
	public static void main(String[] args) {
		System.out.print("몇 게임? ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {

			System.out.print("[" + (i+1) + " 게임] : ");
			int[] lotto = new int[6];
			for (int j = 0; j < 6; j++) {
				// (int) (Math.random() * [개수] + 시작숫자)
				int rand = (int) (Math.random() * 45 + 1); // 1~45
				lotto[j] = rand;
				
				// 중복제거
				for (int k = 0; k < lotto.length; k++) {
					if( j == k ) continue;
					if( rand == lotto[k] ) {
						j--;
						break;
					}
				}
			} 
			// 오름차순 정렬
			Arrays.sort(lotto);
			
			for (int j = 0; j < lotto.length; j++) {
				System.out.print(lotto[j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}



