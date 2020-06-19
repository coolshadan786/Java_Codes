class Outer{
	int x=10;
	void m() {
		int y=20;
		class Inner{
			void m2() {
				System.out.println(x);
				System.out.println(y);
				System.out.println("m2 of inner class");
			}
		}Inner i=new Inner();
		i.m2();
 	}
}
public class MethodLocal {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.m();
		
		// TODO Auto-generated method stub

	}

}
