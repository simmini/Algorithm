import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       String str=sc.next();

       char a[]=str.toCharArray();

       int answer[]=new int[10];

       for (int i=0;i<a.length;i++){
           int n=a[i]-'0';
           if(a[i]=='6'){
                n=9;
           }
           answer[n]++;
       }
       answer[9]=answer[9]/2+answer[9]%2;
       int max=0;
       for(int i:answer){
           if(i>max){
               max=i;
           }
       }
        System.out.println(max);



    }
}
