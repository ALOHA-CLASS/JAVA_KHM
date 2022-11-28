package Day10.Ex05_UserDefineException;

// 사용자 정의 예외 클래스 선언
// public class ????Exception extends Exception {  }
public class StorageOverflowException extends Exception {
	
	public StorageOverflowException() {
		
	}
	
	public StorageOverflowException(String message) {
		super(message);
	}

}
