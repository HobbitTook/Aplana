import java.util.Scanner;

public class Task12 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите предложение");
        String s = scan.nextLine();
        String b;
        b = s.replaceAll (" ","");
        System.out.println(b);
    }
}