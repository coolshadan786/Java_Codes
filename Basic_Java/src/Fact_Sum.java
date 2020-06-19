import java.util.*;
public class Fact_Sum {
		
		public static int fact(int n) {
			if(n==0)return 1;
			return n*fact(n-1);
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the test case");
			int t=sc.nextInt();
			for(int k=0;k<t;k++) {
				System.out.println("Enter the no");
				int n=sc.nextInt();
				int x=fact(n);
				System.out.println(x);
			}

		}

	}
