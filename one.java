import java.util.Scanner;
public class one {
 public static void main(String[] args) 
 throws java.io.IOException {
  Scanner in = new Scanner(System.in);
  int kol, i;
  System.out.println("Введите количество чисел, которое вы хотите ввести");
  kol = in.nextInt();
  int[] nums = new int[kol];
  System.out.println("Введите числа");
  for(i=0; i<nums.length; i++) 
  nums [i] = in.nextInt();
  System.out.println("\nРезультат:");
  for (i=0; i<kol; i++) { 
   int a = 0, b = 1; // для рассчёта ряда фибоначи
   if ((nums [i] == a) || (nums [i] == b)) System.out.print(nums [i] + " ");
   while (b<10000) {
    a = b;
    b = b + a;
    if ((nums [i] == a) || (nums [i] == b)) System.out.print(nums [i]+ " ");
   }
  }
  System.out.println("Эти числа принадлежат последовательностти Фибоначи");
System.out.println("Если ничего не вывелось значит, простых чисел нет");
 }
}
