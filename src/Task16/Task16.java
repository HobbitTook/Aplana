import java.io.*;

public class Task16 {
    public static void main(String[] args){
        try{
            FileInputStream fstream = new FileInputStream("D:\\text.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
        }catch (IOException e){
            System.out.println("Ошибка"+e);
        }
    }
}