

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		 int a,b;
		 int c,d;
		 int sum=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		a=Integer.parseInt(br.readLine());
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<a;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			b=Integer.parseInt(st.nextToken());
			c=Integer.parseInt(st.nextToken());
			bw.write("Case #"+(i+1)+": "+b+" + "+c+" = "+(b+c)+"\n");
			
		}
bw.flush();
bw.close();
		 
	}
}
