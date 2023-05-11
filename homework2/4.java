package homework2;
/** Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Task4 task4 = new Task4();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder text;
        System.out.print("Input your string: ");
        text  = task4.inputText(reader);
        System.out.println(ANSIConstants.ANSI_GREEN + "Input accepted: " + text.toString()
                + ANSIConstants.ANSI_RESET);
    }
    public StringBuilder inputText(BufferedReader r) throws IOException {
        StringBuilder s = new StringBuilder(r.readLine());
        if (s.length() == 0) {
            throw new IOException("Input can not be empty!");
        }
        return s;
    }
}
