import java.util.Scanner;
public class two {
 	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		double result;
 		System.out.println("Введите число");
		n = in.nextInt();
		double a = result = n;
		double b = 1;
		while (b<10000) {
			a *= (-b) / (b+1);
			result += a;
			b++;
		}
		System.out.println(result);
	}
}