// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

package Lesson1.Homework;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = numberSum(n);
        int work =  numberWork(n);
         System.out.println(sum);
         System.out.println(work);
    }

    public static int numberSum(int n){
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;   
        }
        return result;  
    }

    public static int numberWork(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;   
        }
        return result;

    }
}
