package Task18;

import java.io.*;


public class Task18 {
    public static int count = 0;
    public static void readFile()
    {
        try
        {
            FileInputStream fstream = new FileInputStream("D:\\writer2.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null)
            {
                System.out.println(strLine);
                {++count;}
            }
        }catch (IOException e){
            System.out.println("Ошибка"+e);
        }
    }
    public static void writeFile()   {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст");
        try (FileWriter fw = new FileWriter("D:\\writer2.txt")){
            while (count!=0){
                System.out.println("");
                str = br.readLine();
                str = str +"\r\n";
                fw.write(str);
                count--;
            }
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода"+e);
        }
    }

    public static void main(String[] args) {
        Task18.readFile();
        Task18.writeFile();
    }
}