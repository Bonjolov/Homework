
import java.util.Scanner;
public class P5DecimaltoHexadecimal {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int i = sc.nextInt();
	String iAsHex=Integer.toHexString(i).toUpperCase();
	System.out.println(iAsHex);
	sc.close();
	}
}
