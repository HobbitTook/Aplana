package Task15;

public class Task15 {
    public static void main(String[] args) {
        int []a=new int [] {44,58,33,80,13,9,4,18,77,100};

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a.length-1; j++){
                if(a[j]>a[j+1]){
                    int d =a[j];
                    a[j]=a[j+1];
                    a[j+1]=d;
                }
            }
        }
        System.out.println ( "отсортированный массив : ");
        for (int i=0; i<a.length; i++){
            System.out.printf(a[i] + " ");
        }
    }

}