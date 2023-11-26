import java.util.Scanner;
public class one {
 	public static void main(String[] args) 
	throws java.io.IOException {
		Scanner in = new Scanner(System.in);
		int kol, i;
 		System.out.print("Введите количество чисел, которое вы хотите ввести\n");
		kol = in.nextInt();
		int[] nums = new int[kol];
		System.out.println("Введите числа");
		for(i=0; i<kol; i++) 
			nums [i] = in.nextInt();
		System.out.println("\nРезультат:");
		for (i=0; i<kol; i++) 
			if (nums [i] == 0 || nums [i] == 1 || nums [i] == 2 || nums [i] == 3
			 || nums [i] == 5 || nums [i] == 8 || nums [i] == 13) /* последовательность 
можно до бесконечности писать, напичал пару штук, чтобы показать суть моего решения) */
			System.out.println("Число " + nums [i] + " принадлежит последовательностти Фибоначи");
		System.out.println("Если ничего не вывелось значит, простых чисел нет");
	}
}
