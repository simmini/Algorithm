package 기초;

import java.util.ArrayList;
import java.util.Arrays;


public class 그림확대 {

	static class Solution {
	     public String[] solution(String[] picture, int k) {
	        int tmp=picture.length*k;
	       
	    	String[] answer =new String[tmp];
	        
	    	System.out.println(Arrays.toString(answer));
	        int num=0;
	        ArrayList<String> list=new ArrayList<>();
	        for(int i=0;i<picture.length;i++) {//한개
	        		for(int cnt=0; cnt<k;cnt++) {
	        			answer[num]="";
	        			for(int j=0;j<picture[i].length();j++) {//한개의 문자열의 갯수
	        			
	        				for(int cnt1=0; cnt1<k;cnt1++) {
	        					answer[num]+=picture[i].charAt(j);	
	        					System.out.println(picture[i].charAt(j));
	        					
	        				
	        				}
	        		}	
	        			num++;
	        		}
	        }
	        
	        
	        
	        System.out.println(Arrays.toString(answer));
	        
	        return answer;
	    }
	}
	
	
	public static void main(String[] args) {
	
		String str[]={"x.x", ".x.", "x.x"};
		Solution sol=new Solution();
		int k=3;
		sol.solution(str,k);
		
			

	}

}
