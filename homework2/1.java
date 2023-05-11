package homework2;

/** Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        float x = task1.getFloat();
        System.out.println(ANSIConstants.ANSI_GREEN + "Число " + x + " успешно принято!"
                + ANSIConstants.ANSI_RESET);
    }

    public float getFloat() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Введите любое дробное число: ");
                float number = sc.nextFloat();
                if( number == Float.POSITIVE_INFINITY ){
                    throw new InputMismatchException();
                }
                return number;
            } catch (InputMismatchException e) {
                System.out.println(ANSIConstants.ANSI_RED + "Ошибка ввода! Попробуйте снова!"
                        + ANSIConstants.ANSI_RESET);
                sc.nextLine();
            }
        }
    }
}
