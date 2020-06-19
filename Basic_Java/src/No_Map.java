public class No_Map {
	
	public static int map(int n,int a[],int b[]) {
		int pos=0,neg=0,notattempt=0;
		for(int i=0;i<n;i++) {
			if(a[i]==0)
				notattempt++;
			else if(a[i]==b[i])
				pos++;
			else if(a[i]!=b[i])
				neg++;
		}
		return (pos*3)+(neg* -1);
		
	}
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int[] b= {1,3,3,8,5,6};
		int len=a.length;
		int result=map(len,a,b);
		System.out.println(result);
		
				
	}

}
