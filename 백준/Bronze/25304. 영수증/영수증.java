

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
		b=Integer.parseInt(br.readLine());
		
		 for(int i=0;i<b;i++) {
			 StringTokenizer st=new StringTokenizer(br.readLine()," ");
			 
			 c=Integer.parseInt(st.nextToken());
			 d=Integer.parseInt(st.nextToken());
			 sum+=c*d;
			 
		 }
		String ans=(a==sum)?"Yes":"No";
		System.out.println(ans);

		
		 
	}
}
