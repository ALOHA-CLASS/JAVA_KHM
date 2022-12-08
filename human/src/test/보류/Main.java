package test.보류;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static List<Board> boardList = new LinkedList<>();
	public static List<Reply> replyList = new LinkedList<>();
	public static Scanner sc = new Scanner(System.in);
	
	public static void boardMenu() {
		System.out.println("########## 게시글 ##########");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 조회");
		System.out.println("3. 게시글 쓰기");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.print("입력 : ");
	}
	
	public static void replyMenu() {
		System.out.println("########## 댓글 ##########");
		System.out.println("1. 댓글 목록");
		System.out.println("2. 댓글 조회");
		System.out.println("3. 댓글 쓰기");
		System.out.println("4. 댓글 수정");
		System.out.println("5. 댓글 삭제");
		System.out.print("입력 : ");
	}
	
	public static void menu() {
		System.out.println("########## 게시판 ##########");
		System.out.println("1. 게시글");
		System.out.println("2. 댓글");
		System.out.println("0. 종료");
		System.out.print("입력 : ");
	}
	
	public static void main(String[] args) {
		do {
			menu();
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			if( menuNo == 0 ) break;
			
			switch (menuNo) {
				case 1:
						boardMenu();
						break;
				case 2:
						replyMenu();
						break;
	
				default:
						break;
			}
			
			
		} while (true);
		
		System.out.println("게시판이 종료되었습니다.");
	}

}
