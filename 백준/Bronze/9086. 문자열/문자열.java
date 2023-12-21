

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		String a[]=new String[n];
	
		for(int i=0;i<n;i++) {
			a[i]=sc.next();
		
			System.out.print(a[i].charAt(0));
			System.out.print(a[i].charAt(a[i].length()-1));
		
			System.out.println();
		}
		
		
		
	
		

		
	}
		
} 
