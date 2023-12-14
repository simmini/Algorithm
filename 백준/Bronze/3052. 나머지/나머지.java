

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<10;i++) {
			int n=sc.nextInt();
			set.add(n%42);
		}
		System.out.println(set.size());
		
	}

}
