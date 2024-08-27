import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");


            int n[]=new int [st.countTokens()];
            for(int i=0;i<n.length;i++){
                n[i]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(n);

            if(n[0]==0&&n[1]==0&&n[2]==0) break;


            if(Math.pow(n[2],2)==(Math.pow(n[0],2)+Math.pow(n[1],2))){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }

        }
    }
}