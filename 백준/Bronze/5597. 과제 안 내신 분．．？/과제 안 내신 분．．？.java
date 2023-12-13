
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	
		int arr[]=new int[30];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<28;i++) {
			int a=sc.nextInt();
			arr[a-1]=1;
		
		}
		
		for(int i=0;i<30;i++) {
			if(arr[i]!=1) {
				System.out.println(i+1);
			}
		}
	}
} 
