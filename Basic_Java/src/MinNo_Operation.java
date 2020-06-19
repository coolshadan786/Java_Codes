import java.util.*;
public class MinNo_Operation {
	static void operation(int n) {
		int op=0;
		int sum=0;
		int value=0,v2=0;
				value=n/3;
				Math.floor(value);
				if(value!=3)
				value--;
				op++;
				System.out.println(op+ " " + value);
				sum=n-value;
				v2=sum/5;
				op=(int) (op+ Math.floor(v2));
//				op=op+v2;
		System.out.println("operation need is: " +op);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			System.out.println("Enter the no");
			int n=sc.nextInt();
			operation(n);
			
		}

	}

}
