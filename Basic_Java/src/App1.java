import printer.Printer;

public class App1 {

	public static void main(String[] args) {
		(new Printer()).print();
		Printer p=new Printer();	//1st
			p.print();				//2nd
	}
}
