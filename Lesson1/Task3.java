// Дан массив nums = [3,2,2,3,4,3] и число val вводим с клавиатуры

// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.
// Ввод: 3
// Вывод:
// 2, 2, 4, 3, 3, 3

package Lesson1;


public class Task3 {
    public static void main(String [] args) {
        int [] arr = new int [] {3,2,2,3,4,3};
        int [] arr_result = new int [arr.length];
        int val = 3;
        int ideax = 0;
      
        for (int i = 0; i < arr.length; i++){
            if (val != arr[i]) {
                arr_result[ideax] = arr[i];
                ideax++;
            }
        }
        for (int i = ideax; i < arr_result.length; i++) {
            arr_result[i] = val;
        }
        for (int i : arr_result) {
            System.out.print(i + " ");
        }
  
    }
    
}
