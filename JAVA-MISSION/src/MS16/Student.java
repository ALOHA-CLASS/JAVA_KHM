package MS16;

public class Student {

	private int no;
	private String name;
	private int score;
	private String className;
	
	
	public Student() {
		this(0, "", 0, "");
	}

	public Student(int no, String name, int score, String className) {
		this.no = no;
		this.name = name;
		this.score = score;
		this.className = className;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public String getClassName() {
		return className;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", score=" + score + ", className=" + className + "]";
	}
	
}
