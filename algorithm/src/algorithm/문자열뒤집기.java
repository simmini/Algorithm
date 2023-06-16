package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열뒤집기 {
	
	static class Solution {
	    public String solution(String my_string, int s, int e) {
	     
	        ArrayList<Character> list=new ArrayList<>();
	        for(int i=0;i<my_string.length();i++) {
	        	list.add(my_string.charAt(i));
	        }
	        
	        int j=e;
	        int end=(e-s)/2;
	        StringBuilder sb=new StringBuilder(my_string);
	        for(int i=s;i<=s+end;i++) {
	        	
	        
	        	//지정된 위치에 문자열 변경
	        	sb.setCharAt(i, list.get(j));
	        	sb.setCharAt(j, list.get(i));
	        	my_string=sb.toString();
	       
	        	j--;
	        }
	 
	        return my_string;
	    }
	}

	public static void main(String[] args) {
			
		String my_string="Progra21Sremm3";
		int s=6;
		int e=12;
		
		Solution sol=new Solution();
		sol.solution(my_string, s, e);
	}

}
