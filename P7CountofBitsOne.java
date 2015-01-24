import java.util.Scanner;


public class P7CountofBitsOne {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		for (int i = 0; i < 33; i++) {
			int b  = n&(1<<i);
			b = b>>i;
			if (b==1) {
				res = res+1;
				
			}
			
		}
		res = res-1;	
		System.out.println(res);
		sc.close();
	}

}
