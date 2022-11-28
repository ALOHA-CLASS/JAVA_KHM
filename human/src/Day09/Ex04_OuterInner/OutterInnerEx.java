package Day09.Ex04_OuterInner;

public class OutterInnerEx {
	
	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Inner inner = outter.new Inner();
		inner.print();
	}

}
