package Lesson1;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in, "Cp866");
        System.out.printf(" Введите имя: ");
        String name = reader.nextLine();
            System.out.printf(" Привет " + name);
            reader.close();
    }
    
}
