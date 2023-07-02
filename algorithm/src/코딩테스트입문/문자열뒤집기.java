package Programmers;

import java.util.ArrayList;

public class 문자열뒤집기 {

	static class Solution {
		
		//a.for문 사용
	    public String solution(String my_string) {
	        String answer = "";
	        String answer1="";
	        
	        char chr[]=my_string.toCharArray();
	        
	        
	        for(int i=chr.length-1;i>=0;i--) {
	        	//1. char형태로 접근
	        	answer+=chr[i];
	        	//2. String형태로 접근
	        	answer1+=my_string.charAt(i);
	        }
	        
	        
	        
	        System.out.println(answer1);
	        return answer;
	    }
	}
	
	
	//b. reverse함수 사용
	static class Solution1 {
	    public String solution(String my_string) {
	        String answer = "";
	        //1.StringBuilder사용
	        StringBuilder sb=new StringBuilder();
	        sb.append(my_string);
	        sb.reverse();
	        
	        //2.StringBuilder->String타입으로 변환
	        answer=sb.toString();
	        System.out.println(answer);
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		
		Solution sol=new Solution();
		
		Solution1 sol1=new Solution1();
		sol.solution("jaron");
		sol1.solution("jaron");
	}

}
