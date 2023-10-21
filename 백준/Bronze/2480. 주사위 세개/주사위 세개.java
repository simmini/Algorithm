

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	 int a,b,c=0;
	// BufferedReader br=new BufferedReader(new InputStreamReader(System.in))
	 
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	int ans=0;
	if(a==b&&b==c&&c==a) {
		ans=10000+a*1000;
	}else if(a==b||a==c) {
		ans=1000+a*100;
	}else if(b==c) {
		ans=1000+b*100;
	}else if(a>b&&a>c) {
		ans=a*100;
	}else if(b>c&&b>a) {
		ans=b*100;
	}else {
		ans=c*100;
	}
	//ans=Math.max(Math.max(a, b), c);
	System.out.println(ans);
	}

}
