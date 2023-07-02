package Programmers;

import java.util.Arrays;

public class 배열뒤집기 {
	
	
	static class Solution {
	    public int[] solution(int[] num_list) {
	        int[] answer = new int [num_list.length];
	         
	        for(int i=num_list.length-1;i>=0;i--) {//4 3 2 1 0
	        	int end=num_list.length-i-1;
	        	answer[end]=num_list[i];
	        	
	        }
	        System.out.println(Arrays.toString(answer));
	       
	        
	        
	        return answer;
	    }
	}

	public static void main(String[] args) {
		
		Solution sol=new Solution();

		int[] a= {1, 2, 3, 4, 5};
		sol.solution(a);
	}

}
