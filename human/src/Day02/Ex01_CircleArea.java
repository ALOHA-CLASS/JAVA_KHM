package Day02;

public class Ex01_CircleArea {
	
	public static void main(String[] args) {
		// 원의 넓이 = ㅠr^2
		final double PI = 3.14;		// 원주율을 상수로 선언
		double radius = 5;			// 원의 반지름
		double circleArea = radius * radius * PI;
		
		// 원의 넓이를 출력
		System.out.println("반지름 : " + radius);
		System.out.println("넓이 : " + circleArea);
		
		double raidus2 = 10;
		double circleArea2 = Math.pow(raidus2, 2) * Math.PI;
		// Math.pow(밑, 지수) : 밑^지수 - 거듭제곱을 연산해주는 메소드 
		// ex) Math.pow(2,3) : 2^3 
		System.out.println("반지름2 : " + raidus2);
		System.out.println("넓이2 : " + circleArea2);
		
		
		
	}

}
