import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();

       int sum=a*b*c;

       //int ->string
        String str=String.valueOf(sum);


       //string->char
       char []ch=str.toCharArray();

       int answer[]=new int[10];
        //숫자를 문자로 하나씩
        //숫자로 해당 있으면 배열 ++

       for(int i=0;i<ch.length;i++){
           answer[(ch[i]-'0')]++;
       }
       for (int i:answer){
           System.out.println(i);
       }
    }
}
