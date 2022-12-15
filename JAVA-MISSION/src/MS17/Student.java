package MS17;

public class Student {

	private int no;
	private String name;
	
	public Student() {
		this(0, "이름없음");
	}
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	
	
}
