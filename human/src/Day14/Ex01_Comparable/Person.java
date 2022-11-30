package Day14.Ex01_Comparable;

public class Person implements Comparable<Person> {
	
	String name;		// 이름
	int age;			// 나이
	
	// 생성자
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		// 해당객체.나이 - 비교객체.나이 
		// 18 - 44   :  음수    --> 18을 더 앞에 정렬 (오름차순)
		
		// 비교객체.나이 - 해당객체.나이 
		// 44 - 18   :  양수    --> 18을 더 뒤에 정렬 (내림차순)
		int gap = this.getAge() - o.getAge();	
		return gap;
	}
	
	

}








