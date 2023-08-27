import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[][]=new int[n][2];
		int ans[]= new int [n]; 
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
				ans[i]=1;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<arr[i][1];j++) {
				ans[i]=(ans[i]*arr[i][0])%10;
				
			}
			
		}
		for(int i=0;i<n;i++) {
			if(ans[i]==0) {
				ans[i]=10;
			}
			System.out.println(ans[i]);
		}
		
	}
}
