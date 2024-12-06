import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       int answer[]=new int[26];
       char a[]=str.toCharArray();
       for(int i=0;i<a.length;i++){
            answer[a[i]-'a']++;
       }

       for (int i=0;i<26;i++){
           System.out.println(answer[i]);
       }

    }
}
