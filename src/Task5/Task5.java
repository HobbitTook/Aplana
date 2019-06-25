package Task5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число:");
        int m = scan.nextInt();
        System.out.println(
                "1x" + m + " = " + (1*m) + "\n" +
                "2x" + m + " = " + (2*m) + "\n" +
                "3x" + m + " = " + (3*m) + "\n" +
                "4x" + m + " = " + (4*m) + "\n" +
                "5x" + m + " = " + (5*m) + "\n" +
                "6x" + m + " = " + (6*m) + "\n" +
                "7x" + m + " = " + (7*m) + "\n" +
                "8x" + m + " = " + (8*m) + "\n" +
                "9x" + m + " = " + (9*m) + "\n" +
                "10x" + m + " = " +(10*m)+"\n");
    }
}
