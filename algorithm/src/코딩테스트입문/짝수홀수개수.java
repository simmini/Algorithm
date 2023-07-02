package Programmers;

import Programmers.중앙값구하기.Solution;

public class 짝수홀수개수 {

	static class Solution {
	    public int[] solution(int[] num_list) {
	        int[] answer = {0,0};
	        
	        for(int arr:num_list) {
	        	if(arr%2==0) {
	        		answer[0]+=1;
	        	}else {
	        		answer[1]+=1;
	        	}
	        }
	        
	        return answer;
	    }
	}
	public static void main(String[] args) {
		Solution sol=new Solution();
		int arr[]= {10, 9, 7, 3, 5};
		sol.solution(arr);

		
		
	}

}
