

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
	
		
		for(int i=0;i<m;i++) {
			int j=sc.nextInt();//1
			int k=sc.nextInt();//4
			int first=j-1;
			int last=k-1;//3
		
// 			for(int t=j-1;t<=k-1;t++) {//2~3
// 				if(last<=t) {//3
//					break;
//				}
			while(first<last) {
   				int tmp=arr[first];
				arr[first++]=arr[last];
 				arr[last--]=tmp;
			
			}
			}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
		
} 
