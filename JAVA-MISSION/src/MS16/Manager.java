package MS16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {
	
	public static void main(String[] args) {
		
		LinkedList<Student> list = new LinkedList<>();
		list = getTxtToList(list);
		printList(list);
		
	}
	
	// 텍스트 파일입력
	public static LinkedList<Student> getTxtToList(LinkedList<Student> list) {
		try {
			File file = new File("student.txt");
			Scanner sc = new Scanner(file);
			Student std;
			
			while(sc.hasNextLine()) {
				String stn = sc.nextLine();		
				String[] data = stn.split("/");
				
				int no = Integer.parseInt( data[0] );
				String name = data[1];
				int score = Integer.parseInt( data[2] );
				String className = data[3];
				
				std = new Student(no, name, score, className);
				
				list.offer(std);		
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}			
		return list;
	}
	
	
	// 리스트 출력
	public static void printList(LinkedList<Student> list) {
		
		System.out.println("번호\t이름\t성적\t반");
		
		while( !list.isEmpty() ) {
			Student std = list.poll();
			
			int no = std.getNo();
			String name = std.getName();
			int score = std.getScore();
			String className = std.getClassName();
			
			System.out.println(no + "\t" + name + "\t" + score + "\t" + className);
		}
	}

}

























