//Дан массив двоичных чисел, например [1,1,0,1,1,1,1,0,1,1,1],
//вывести максимальное количество подряд идущих 1.
package Lesson1;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,0,1,1,1,1,0,1,1,1,1,1};
    
        int count = 0;
        int count_max = 0;
        for (int i: arr){
            if (i == 1) {
                count ++; 
            }
            else {
                if (count >= count_max){
                    count_max = count;
                }
                count = 0;
            }

        }
        if (count > count_max) {
            count_max = count;
        }
        System.out.print(count_max);
    }
    
}
