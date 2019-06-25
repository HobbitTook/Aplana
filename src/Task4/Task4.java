package Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число в двоичном формате: ");
        String bin = scn.nextLine();
        int binNum = Integer.parseInt(bin, 2);

        System.out.println(binNum);
    }
}
