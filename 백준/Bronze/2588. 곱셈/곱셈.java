

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	
		int A,B;
		Scanner sc=new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		int tmp=B%10;//5
		int value=B/10;//38
		int one=A*tmp;
		System.out.println(one);
		tmp=value%10;//8
		value=value/10;//3
		int two=A*tmp;
		System.out.println(two);
		int three=A*value;
		System.out.println(three);
		
		System.out.println(one+two*10+three*100);
	
	}

}
