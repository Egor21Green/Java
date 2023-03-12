import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task1 {
    static Logger logger = Logger.getLogger(Task1.class.getName());
    
    public static void main(String[] args) throws SecurityException, IOException {
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        logger.setLevel(Level.INFO); // установка уровня логгирования
        // сортировка и вывод результатов
        logger.info("Sourse array: " + Arrays.toString(arr));
        bubbleSort(arr);
        logger.info("Sorted array: " + Arrays.toString(arr));
    
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
        if (arr[j] > arr[j+1]) {
        // меняем элементы местами
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        }
        }
        logger.info("Intermediate result on " + (i+1) + ": " + Arrays.toString(arr)); // выводим результаты каждой итерации
        }
}
}