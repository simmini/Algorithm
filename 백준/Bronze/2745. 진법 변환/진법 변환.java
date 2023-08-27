import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		String arr[]=br.readLine().split(" ");
		int N=Integer.parseInt(arr[1]);
		
		String arr1[]=arr[0].split("");
		int B[]= new int[arr1.length];
		int ans=0;
	
		for(int i=0;i<arr1.length;i++) {
			//System.out.println(arr1[i].charAt(0));
			B[i]=arr1[i].charAt(0);
			if('A'<=B[i]&&B[i]<='Z') {
				B[i]=B[i]-55;
			}else {
				B[i]=Integer.parseInt(arr1[i]);
			}
			ans+=B[i]*Math.pow(N, (arr1.length-i-1));
		
			}
		
		System.out.println(ans);
		
	}
}
