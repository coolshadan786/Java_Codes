interface Agreement{
	void m1();
}
class AgreementClass{
	void m2(Agreement i) {
		i.m1();
	}
}

class IAgree implements Agreement{
	public void m1() {
		System.out.println("m1 of mtdh of interface");
	}
}
public class AgreeMain {

	public static void main(String[] args) {
		AgreementClass ac=new AgreementClass();
		IAgree ia=new IAgree();
		ac.m2(ia);
		// TODO Auto-generated method stubh
	}
}
