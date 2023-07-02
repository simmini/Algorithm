package Programmers;

import Programmers.피자나눠먹기1.Solution;

public class 점의위치구하기 {
	
	static class Solution {
	    public int solution(int[] dot) {
	        int answer = 0;
	        
	        if(dot[0]>0&&dot[1]>0) {
	        	answer=1;
	        }else if(dot[0]<0&&dot[1]>0) {
	        	answer=2;
	        }else if(dot[0]<0&&dot[1]<0) {
	        	answer=3;
	        }else {
	        	answer=4;
	        }
	        
	        
	        return answer;
	    }
	}

	public static void main(String[] args) {
		Solution sol=new Solution();

		int[]dot= {-7,9};
		sol.solution(dot);
	}

}
