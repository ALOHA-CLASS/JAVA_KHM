package MS17;

import java.util.Scanner;

public class StudyCafe {

	private static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		Student[][] seat = new Student[3][];
		seat[0] = new Student[40];
		seat[1] = new Student[20];
		seat[2] = new Student[30];
		
		while( true ) {
			menu();
			int menuNo = sc.nextInt();
			if( menuNo == 0 ) break;
			
			switch (menuNo) {
			case 1:
					seat(seat);
					break;
			case 2:
					goBack(seat);
					break;
			case 3:
					list(seat);
					break;
			default:
					break;
			}
			
		}
		System.out.println("시스템이 종료되었습니다.");
	}
	
	/**
	 * 메뉴
	 */
	public static void menu() {
		System.out.println("************** 모두의 스터디카페 *************");
		System.out.println("1. 이용하기" );
		System.out.println("2. 반납하기");
		System.out.println("3. 좌석현황" );
		System.out.println("0. 종료하기");
		System.out.println("========================================");
		System.out.print(">>입력 : ");
	}
	
	/**
	 * 이용하기
	 */
	public static void seat(Student[][] seat) {
		System.out.print(">>수강번호 : ");
		int no = sc.nextInt();
		System.out.print(">>이름 : ");
		String name = sc.next();
		Student student = new Student(no, name);
		
		System.out.println("(1) 1F - 오픈라운지");
		System.out.println("(2) 2F - 미디어실");
		System.out.println("(3) 3F - 프로젝트실");
		System.out.print(">>입력 : ");
		int N = sc.nextInt();
		
		list(seat, N);
		System.out.print(">>자석번호 : ");
		int M = sc.nextInt();
		if( seat[N-1][M-1] != null ) {
			System.out.println("이미 이용중 입니다. 다른 자리를 이용해주세요");
		} else {
			seat[N-1][M-1] = student;
			System.out.println(N + "층 - " + M + "번 자석이 배정되었습니다.");
			System.out.println("즐거운 코딩시간 되세요!");
			System.out.println();
		}
		
	}
	
	/**
	 * 반납하기
	 */
	public static void goBack(Student[][] seat) {
		System.out.println("(1) 1F - 오픈라운지");
		System.out.println("(2) 2F - 미디어실");
		System.out.println("(3) 3F - 프로젝트실");
		System.out.print(">>입력 : ");
		int N = sc.nextInt();
		
		list(seat, N);
		System.out.print(">>자석번호 : ");
		int M = sc.nextInt();
		
		int no = seat[N-1][M-1].getNo();
		System.out.print(">>수강번호 : ");
		int input = sc.nextInt();
		
		if( no != input ) {
			System.out.println("이용 수강번호가 일치하지 않습니다.");
		} else {
			seat[N-1][M-1] = null;
			System.out.println(N + "층 - " + M + "번 자석이 반납되었습니다.");
			System.out.println("다음에 또 이용해주세요!");
			System.out.println();
		}
	}
	
	/**
	 * 이용현황
	 */
	public static void list(Student[][] seat, int N) {
		
		int empty = 0;
		
		System.out.println("================ 이용현황 =================");
		System.out.println("================== " + N + "층 ==================");
		for (int i = 0; i < seat[N-1].length; i++) {
			if( seat[N-1][i] == null ) {
				System.out.printf("%02d  ", i+1);
				empty++;
			} else {
				System.out.print("--  ");
			}
			if( N == 1 && (i+1) % 10 == 0 )
				System.out.println();
			if( N == 2 && (i+1) % 4 == 0 )
				System.out.println();
			if( N == 3 && (i+1) % 5 == 0 )
				System.out.println();
		}
		System.out.println("========================================");
		System.out.println("\t\t\t이용가능 :     " + empty + "석");
	}
	public static void list(Student[][] seat) {
		
		int empty = 0;
		
		System.out.println("================ 이용현황 =================");
		for (int i = 0; i < seat.length; i++) {
			System.out.println("================== " + (i+1) + "층 ==================");
			empty = 0;
			for (int j = 0; j < seat[i].length; j++) {
				if( seat[i][j] == null ) {
					System.out.printf("%02d  ", j+1);
					empty++;
				} else {
					System.out.print("--  ");
				}
				if( (i+1) == 1 && (j+1) % 10 == 0 )
					System.out.println();
				if( (i+1) == 2 && (j+1) % 4 == 0 )
					System.out.println();
				if( (i+1) == 3 && (j+1) % 5 == 0 )
					System.out.println();
			}
			System.out.println("========================================");
			System.out.println("\t\t\t이용가능 :     " + empty + "석");
		}
	}
}

