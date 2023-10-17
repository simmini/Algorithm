

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 int a,b,c;
		 Scanner sc=new Scanner(System.in);
		 
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=sc.nextInt();
		 
		 if(a==b&&b==c) {
			 System.out.println(10000+a*1000);
		 }else if(a==b||b==c) {
			 System.out.println(1000+b*100);
		 }else if(c==a){
			 System.out.println(1000+c*100);
		 }else {
//			 if(a>b) {
//				if(b>c) {
//				//a>b>c
//					System.out.println(a*100);
//				}else {
//				//a>b<c
//					if(a>c) {
//						//a>c>b
//						System.out.println(a*100);
//					}else {
//						//c>a>b
//						System.out.println(c*100);
//					}
//				}
//			 }else {//b>=a
//				 if(a>c) {
//					 //b>a>c
//					 System.out.println(b*100);
//				 }else {//b>a<c
//					 if(b>c) {
//						 System.out.println(b*100);
//					 }else {
//						 System.out.println(c*100);
//					 }
//				 }
//			 }
			 
			 if(a>b&&a>c) {
				 System.out.println(a*100);
			 }else if(b>a&&b>c){
				 System.out.println(b*100);
			 }else {
				 System.out.println(c*100);
			 }
		 }
	}
}
