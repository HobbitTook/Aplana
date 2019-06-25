import java.util.Scanner;

public class Task9 {
    public static void main (String[] args) {
        int a;
        int x = 2;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        a = in.nextInt();
        int[] ms = new int[a];

        for (int i = 0; i < ms.length; i++) { {
            System.out.print("Введите элемент ms[" + i + "]:");
            ms[i] = in.nextInt();
        }
        }
        for (int i = 0; i < a; i++)
            System.out.print( ms[i]*x + " ");}
}

