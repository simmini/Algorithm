

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
			int m=sc.nextInt();
			String str=sc.next();
			
			for(int k=0;k<str.length();k++) {
				for(int j=0;j<m;j++) {
					System.out.print(str.charAt(k));
				
				}
			}
			System.out.println();
			
		
			
		}
		
	}
		
} 
