package Day14.Ex02_Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class UserListAnonymous {
	
	public static void main(String[] args) {
		
		List<User> userList = new LinkedList<>();
		
		User u1 = new User("cba1001", "김휴먼", 10);
		User u2 = new User("abc1111", "이휴먼", 20);
		User u3 = new User("abc1001", "박휴먼", 30);
		User u4 = new User("bac1001", "권휴먼", 20);
		User u5 = new User("bac2001", "유휴먼", 30);
		
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		
		// 익명객체로 Comparator 인터페이스의 정렬기능 구현하기
		Collections.sort( userList, new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				// 두 문자열을 비교하여 
				// 해당문자열.compareTo(비교문자열);
				// - 해당문자열이 사전순으로 더 앞에오면, 음수
				//    ex) "aaa1234".compareTo("bbb1234") 
				// - 해당문자열이 사전순으로 더 뒤에오면, 양수
				//    ex) "bbb1234".compareTo("aaa1234")
				// - 일치하면, 0
				int gap = o1.id.compareTo(o2.id);
				return gap;
			}
		});
		
		for (User user : userList) {
			System.out.println("id : " + user.id);
		}
		
		
	}

}








