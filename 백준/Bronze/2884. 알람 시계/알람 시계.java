

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

	 int a,b;
	
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine()," ");
	a=Integer.parseInt(st.nextToken());
	b=Integer.parseInt(st.nextToken());
	
	if(b<45) {
		a--;
		b=60-(45-b);
		if(a<0) {
			a=23;
		}
		System.out.println(a+" "+b);
	}else {
		b=b-45;
		System.out.println(a+" "+b);
	}
		
	
	}

}
