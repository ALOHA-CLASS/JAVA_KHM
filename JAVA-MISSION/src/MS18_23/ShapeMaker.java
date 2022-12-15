package MS18_23;

import java.util.LinkedList;
import java.util.Scanner;

public class ShapeMaker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape = null;
		double width = 0.0;
		double height = 0.0;
		double radius = 0.0;
		LinkedList<Shape> list = new LinkedList<Shape>();
		
		while( true ) {
			System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.print(">>");
			String input = sc.next();
			
			if( input.equals("그만") ) break;
			
			switch (Integer.parseInt(input)) {
				case 1:
					System.out.print("가로>> ");
					width = sc.nextDouble();
					System.out.print("높이>> ");
					height = sc.nextDouble();
					shape = new Triangle(width, height);
					list.add(shape);
					break;
				case 2:
					System.out.print("가로>> ");
					width = sc.nextDouble();
					System.out.print("높이>> ");
					height = sc.nextDouble();
					shape = new Rectangle(width, height);
					list.add(shape);
					break;
				case 3:
					System.out.print("반지름>> ");
					radius = sc.nextDouble();
					shape = new Circle(radius);
					list.add(shape);
					break;
			}
			
		}
		
		for (Shape s : list) {
			if( s instanceof Triangle ) System.out.print("[Triangle]\t"); 
			if( s instanceof Rectangle ) System.out.print("[Rectangle]\t"); 
			if( s instanceof Circle ) System.out.print("[Circle]\t"); 
			System.out.print("넓이 : " + s.area() + "\t");
			System.out.print("둘레 : " + s.round() + "\t");
			System.out.println();
		}
		
		
		
		
	}
}
