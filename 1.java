package HomeWork1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    public static void main(String[] args) throws MyException, IOException, NumberFormatException {
        Exercise1 exercise1 = new Exercise1();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder value;
        System.out.print("Введите значение больше 0: ");

        value  = exercise1.inputValue(reader);

        System.out.println("Число " + value);
    }
    public StringBuilder inputValue(BufferedReader r) throws  MyException, IOException{
        StringBuilder v1 = new StringBuilder(r.readLine());
        if (v1.length() == 0) {
            throw new IOException("Значение не может быть пустым");
        }
        try {
            Integer.parseInt(v1.toString());
        } catch (NumberFormatException e) {
            System.out.println("Значение должно быть числом");
            System.exit(0);
        }
        if (Integer.parseInt(v1.toString().trim()) <= 0) {
            throw new MyException("Значение должно быть больше 0");
        }
        return v1;
    }
}
