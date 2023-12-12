

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	




		int a, b,tmp;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt(); 
		int arr[]=new int[n+1];
		
		for(int i=1;i<=n;i++) {
			arr[i]=i;
		}
		for(int i=0;i<m;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			tmp=arr[a];
			arr[a]=arr[b];
			arr[b]=tmp;
		}
		
		for(int i=1;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
} 
