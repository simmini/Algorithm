
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		 int a,b;
		 int c,d;
		 int sum=0;
		
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 a=Integer.parseInt(br.readLine());
		 b=a/4;
		 if(a%4!=0) {
			 b++;
		 }
		 for(int i=0;i<b;i++) {
			 System.out.print("long ");	 
		 }
		 System.out.println("int");
		 
	}
}
