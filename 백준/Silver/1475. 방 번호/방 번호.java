import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char a[]=str.toCharArray();
        int answer[]=new int[10];

        for(int i=0;i<a.length;i++){
            answer[a[i]-'0']++;
        }
        //6 :2개 9 :2개 =>2세트임 =>4/2=2

        //6 :1개 9 :2개 => 2세트 =3/2=1.xx 올림


        //6솨 9 처리하고
        int max=0;

        for(int i=0;i<10;i++){
            if(i!=6&&i!=9){
                if(answer[i]>max){
                    max=answer[i];
                }
            }

        }


        int tmp=(int)(Math.ceil((answer[6]+answer[9])/2.0));
        if(max>tmp){
            System.out.println(max);
        }else{
            System.out.println(tmp);
        }

     //중복된게 있으면 하나씩 추가된거
        //예외 6,9는 2개가 1개
    }
}
