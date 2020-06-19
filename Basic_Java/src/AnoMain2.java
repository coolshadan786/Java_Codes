interface Iinterface{
	void m1();
}
class Ano{
	public void m2(Iinterface i) {
		i.m1();
	}
}
public class AnoMain2 {

	public static void main(String[] args) {
		Ano an=new Ano();
		an.m2(new Iinterface () {
			public void m1() {
				System.out.println("m1 of mtdh");
			}
		});
		// TODO Auto-generated method stub

	}

}
