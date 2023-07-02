package Programmers;

import Programmers.중복된숫자개수.Solution;

public class 순서쌍의개수 {
	static class Solution {
	    public int solution(int n) {
	        int answer = 0;
	       
	        for(int i=1;i<=n;i++) {
	        	answer+=n%i==0?1:0;
	        }
	          System.out.println(answer);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		Solution sol=new Solution();
		int n=20;
		sol.solution(n);
			
	}

}
