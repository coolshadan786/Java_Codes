import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		for(int i=data;i>0;i--) {
			for(int j=0;j<i;j++) {
					System.out.print(i +" ");// TODO Auto-generated method stub
			}
			System.out.println();
		}
	}
}
