package Task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task19 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        String str = reader.readLine();
        int sum = 0, a;
        int c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(str.length() - 1 - i);

            if(c == '1' || c == '0') {
                if (c == '1')
                    a = 1;
                else a = 0;
            } else {
                System.out.println("Неверный ввод!");
                break;
            }
            sum += (a * (1<<i));
        }

        System.out.println("\"" + str + "\" -> " + sum);
    }}