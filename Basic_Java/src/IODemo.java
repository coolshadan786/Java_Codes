public class IODemo {
	int x=9;
		class Inner{
			public void m2() {
				System.out.println("m2 of inner class");
			}
		}
	
	public static void main(String[] args) {
		 IODemo.Inner t=new IODemo().new Inner();
		 t.m2();
		// TODO Auto-generated method stub

	}

}
