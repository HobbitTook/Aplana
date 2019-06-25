import java.util.Scanner;

public class Task10 {
    public static void main (String[] args) {
        int a, b;
        int x = 3;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во строк массива: ");
        a = in.nextInt();
        System.out.print("Введите кол-во столбцов массива: ");
        b = in.nextInt();
        int[][] ms = new int[a][b];

        for (int i = 0; i < ms.length; i++) {
            for (int j = 0; j < ms[i].length; j++) {
                System.out.print("Введите элемент ms[" + i + "][" + j + "]:");
                ms[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.println();
            for (int j = 0; j< b; j++) {
                System.out.print( ms[i][j]*x + " ");}
        }
        System.out.print("\n") ;
    }
}