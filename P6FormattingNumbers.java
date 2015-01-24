import java.util.Scanner;


public class P6FormattingNumbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		String aAsBin= Integer.toBinaryString(a);
		int aAsBinNum = Integer.parseInt(aAsBin);
		System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|",a,aAsBinNum,b,c);
		sc.close();
		
	}

}
