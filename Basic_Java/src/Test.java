public class Test {
	public void m(int i) {
		System.out.println("int argu");
	}
	public void m(float f) {
		System.out.println("flaot argu");
	}
	public static void main(String[] args) {
		Test x=new Test();
		x.m(10);
		x.m(10.5f);
		x.m('a');
//		x.m(10.5);
		// TODO Auto-generated method stub
	}
}
                                                 