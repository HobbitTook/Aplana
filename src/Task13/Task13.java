import java.util.Scanner;

public class Task13 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое предложение");
        String s = scan.nextLine();
        int len1 = s.length();
        System.out.println("Введите второе предложение");
        String b = scan.nextLine();
        int len2 = b.length();

        if (len1 > len2)
            System.out.println(s);
        else if (len2>len1)
            System.out.println(b);
        else if (s.equals(b))
            System.out.println("Строки равны");
    }}