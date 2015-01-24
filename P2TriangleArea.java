import java.util.Scanner;


public class P2TriangleArea {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int ax = input.nextInt();
		int ay = input.nextInt();
		
		System.out.println("\n");
		int bx = input.nextInt();
		int by = input.nextInt();
		
		System.out.println("\n");
		int cx = input.nextInt();
		int cy = input.nextInt();
		
		System.out.println("\n");
		int area = Math.abs(ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2;
		System.out.println(area);
		input.close();
	}

}
