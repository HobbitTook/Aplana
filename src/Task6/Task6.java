package Task6;

import java.util.Scanner;

public class Task6 {
    void sred(int x, int y, int z)
    {
        int sred= ((x+y+z)/3)/2; // Вычислить среднее арифметическое и поделить его на два
        if (sred > 3 )
            System.out.println("Программа выполнена корректно" );
        else
        {System.out.println("Программа выполнена некорректно");}

    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        Task6 srednee = new Task6();
        int x,y,z;
        System.out.println("Введите Первое число ");
        x=in.nextInt();
        System.out.println("Введите второе число ");
        y=in.nextInt();
        System.out.println("Введите третье число");
        z=in.nextInt();
        srednee.sred(x,y,z);
    }
}

