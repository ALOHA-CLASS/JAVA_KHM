package MS28;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println(v.capacity());
		
		
	}
}
