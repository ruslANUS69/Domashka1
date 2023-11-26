import java.util.Scanner;
public class eight {
 	public static void main(String[] args) 
	throws java.io.IOException {
		Scanner in = new Scanner(System.in);
		int kol, i;
 		System.out.print("Введите количество чисел, которое вы хотите ввести\n");
		kol = in.nextInt();
		int [] nums = new int[kol];
		System.out.println("Введите числа ");
		for(i=0; i<kol; i++) 
			nums [i] = in.nextInt();
		System.out.println("\nРезультат:");
		for (i=0; i<kol; i++)
			if (nums [i]>0) break;
		double n = nums [i];
		int a = nums [i];

		for (i = nums[i]; i<kol; i++) 
			if (nums [i]>0) break;
		double m = nums [i];
		int b = nums [i];
		System.out.println(m / n - b / a);
	}
}
