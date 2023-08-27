import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		int arr[][]=new int[101][101];
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			for(int j=x;j<x+10;j++) {
				for(int k=y;k<y+10;k++) {
					arr[j][k]++;
					if(arr[j][k]==1) {
						cnt++;
					}
				}
			}
			
		}
		
		System.out.println(cnt);
	
		
		
	}
}
