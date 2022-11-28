package Day09.Ex06_EventListener;

public class Button {
	
	OnClickListener listener;
	
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	// 클릭 이벤트 발생 시, 수행 기능을 정의한 인터페이스
	interface OnClickListener {
		
		void onClick();
		
	}

}
