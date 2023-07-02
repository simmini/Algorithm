package Programmers;

import java.util.Arrays;

public class 배열원소의길이 {

	
	static class Solution {
	    public int[] solution(String[] strlist) {
	        int[] answer = new int[strlist.length];

	        for(int i=0;i<strlist.length;i++) {
	        	answer[i]=strlist[i].length();
	        }
	        
	        System.out.println(Arrays.toString(answer));
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol=new Solution();
		String str[]= {"We", "are", "the", "world!"};
		sol.solution(str);

	}

}
