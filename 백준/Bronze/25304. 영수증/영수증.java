

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 int a,b;
		 int c,d;
		 int sum=0;
		 Scanner sc=new Scanner(System.in);
		 a=sc.nextInt();
		 b=sc.nextInt();
		 String arr[]=new String[2];
		 for(int i=0;i<b;i++) {
			 c=sc.nextInt();
			 d=sc.nextInt();
			 sum+=c*d;
			 
		 }
		String ans=(a==sum)?"Yes":"No";
		System.out.println(ans);

		
		 
	}
}
