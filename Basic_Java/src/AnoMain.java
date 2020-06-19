interface AIInterface{
	void m();
}
public class AnoMain {

	public static void main(String[] args) {
		AIInterface ai=new AIInterface() {
			
			public void m() {
				System.out.println("m of mtdh");
			}
			public void m2() {
				System.out.println("m2 of mtdh");
			}
		};
		ai.m();
		
		// TODO Auto-generated method stub

	}

}
