import java.util.Scanner;
public class three {
 	public static void main(String[] args) 
	throws java.io.IOException {
		Scanner in = new Scanner(System.in);
		int a;
 		System.out.println("Введите число от 0 до 9");
		a = (char) System.in.read();
		switch (a) {
			case '0' : 
				System.out.print("Ноль");
				break;
			case '1' : 
				System.out.print("Один");
				break;
			case '2' : 
				System.out.print("Два");
				break;
			case '3' : 
				System.out.print("Три");
				break;
			case '4' : 
				System.out.print("Четыре");
				break;
			case '5' : 
				System.out.print("Пять");
				break;
			case '6' : 
				System.out.print("Шесть");
				break;
			case '7' : 
				System.out.print("Семь");
				break;
			case '8' : 
				System.out.print("Восемь");
				break;
			case '9' : 
				System.out.print("Девять");
				break;
			}
	}
}