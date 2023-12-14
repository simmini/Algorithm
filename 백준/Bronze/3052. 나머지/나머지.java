

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1.내가 푼방식 -set
//		Scanner sc=new Scanner(System.in);
//		int arr[]=new int[10];
//		Set<Integer> set=new HashSet<>();
//		for(int i=0;i<10;i++) {
//			int n=sc.nextInt();
//			set.add(n%42);
//		}
//		System.out.println(set.size());
		
		//2. set사용안하고 풀이
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean[]arr=new boolean[42];
		
		for(int i=0;i<10;i++) {
			 arr[Integer.parseInt(br.readLine()) % 42] = true;
		}
		int cnt=0;
		for(Boolean a:arr) {
			if(a) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
