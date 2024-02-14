package sveri;
import java.util.Scanner;
public class greater_number {

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int x=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("Greater number =" + x);         
		sc.close();

	}

}
