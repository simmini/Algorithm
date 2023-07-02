package Programmers;

import Programmers.배열뒤집기.Solution;

public class 피자나눠먹기1 {

	static class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        //1. 삼항연산
	        answer=(n%7==0)?n/7:n/7+1;
	
	        //2. if문 -내가 푼것
	        if(n%7==0) {
	        	answer=n/7;
	        }else {
	        	answer=n/7+1;
	        }
	     
	        return answer;
	    }
	}
	
	
	public static void main(String[] args) {
		Solution sol=new Solution();
		sol.solution(15);
	}

}
