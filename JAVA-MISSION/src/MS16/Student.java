package MS16;

public class Student {
	
	// 번호, 이름, 성적, 반
	private int no;
	private String name;
	private int score;
	private String className;
	
	// 생성자
	public Student() {
		this(0, "", 0, "");
	}
	
	public Student(int no, String name, int score, String className) {
		this.no = no;
		this.name = name;
		this.score = score;
		this.className = className;
	}

	// getter, setter
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", score=" + score + ", className=" + className + "]";
	}
	
	
	
	
	
	
}





