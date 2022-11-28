package Day10.Ex01_TryCatch;

public class NumberFormat {
	
	public static void main(String[] args) {
		// "100"  문자열 숫자는 정수타입으로 변환 가능
		// "a100" 이러한 문자열은 정수타입으로 변환 불가
		String numberString = "100";
		String numberAndString = "a100";
		
		// Integer.parseInt( "문자열숫자" )
		// : 문자열숫자를 int 타입 정수 변환한다
		
		int num1 = Integer.parseInt(numberString);
		// NumberFormatException: For input string: "a100"
		// 문자열숫자가 아닌 문자열은 숫자타입으로 변환할 수 없다
		int num2 = Integer.parseInt(numberAndString);
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		
		
	}

}
