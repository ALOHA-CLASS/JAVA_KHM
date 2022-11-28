package Day03;

public class Ex10_GuguAll {

	public static void main(String[] args) {
		// 단에 대한 반복 	: 	1~9
		// 각 단의 곱		:	1~9
		for (int i = 1; i <= 9 ; i++) {
			// i : 1
			for (int j = 1; j <= 9; j++) {
				// i : 1
				// j : 1,2,3,4,5,6,7,8,9
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print("\t");
				// 1*1=1_____1*2=2_____...	
			}
			System.out.println(); // 한 단 끝  -> 다음줄로
		}
		
	}
}





