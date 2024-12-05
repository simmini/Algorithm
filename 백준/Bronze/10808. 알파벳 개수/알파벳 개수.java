import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int alp[]=new int[26];
        char[] ch =a.toCharArray();
        //abcd
        // efgh
        // ijkl
        // mnop
        // qrst
        // uvwx
        // yz
        int answer[]=new int[26];
        for(int j=0;j<ch.length;j++){
            for(int i=0;i<26;i++){
                if(ch[j]==97+i){
                    answer[i]++;
                    break;
                }
            }
        }
        for(int i=0;i<26;i++){
            System.out.print(answer[i]+" ");
        }

        //System.out.println(Arrays.toString(answer));


    }
}
