import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
        int max=0;
        int a[]=new int[3];
       for(int i=0;i<3;i++){
           a[i]=sc.nextInt();
       }
       for(int i=0;i<3;i++){
           for(int j=i+1;j<3;j++){
               if(a[i]>a[j]){
                   int tmp=a[i];
                   a[i]=a[j];
                   a[j]=tmp;
               }
           }

       }
       for(int i=0;i<3;i++){
           System.out.print(a[i]+" ");
       }
    }
}
