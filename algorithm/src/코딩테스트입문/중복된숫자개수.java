package Programmers;

import Programmers.머쓱이보다키큰사람.Solution;

public class 중복된숫자개수 {
	static class Solution {
	    public int solution(int[] array, int n) {
	        int answer = 0;
	        for(int i:array) {
	        	answer+=i==n?1:0;	
	        }
	        System.out.println(answer);
	        
	        
	        return answer;
	    }
	}
	
	
	public static void main(String[] args) {
		Solution sol=new Solution();
		int arr[]= {1, 1, 2, 3, 4, 5};
		int hei=1;
		sol.solution(arr,hei);
//		sol.solution1(arr,hei);

	}

}
