package Day02;

import java.util.Scanner;

public class Ex11_elseIf {
	
	public static void main(String[] args) {
		// 도전
		// 정수를 하나 입력받아서, 
		// 90이상이면 A 
		// 80이상이면 B
		// 70이상이면 C
		// 60이상이면 D
		// 60미만이면 F
		// 학점을 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		String result = "";
		
		if( score >= 90 ) 
			result = "A";
		else if( score >= 80 ) 
			result = "B";
		else if( score >= 70 ) 
			result = "C";
		else if( score >= 60 ) 
			result = "D";
		else 
			result = "F";
		
		System.out.println("학점은 " + result + " 입니다.");
		
		sc.close();
	}

}








