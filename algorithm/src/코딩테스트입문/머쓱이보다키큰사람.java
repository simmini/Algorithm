package Programmers;

import java.util.Arrays;

import Programmers.짝수홀수개수.Solution;

public class 머쓱이보다키큰사람 {
	static class Solution {
	    public int solution(int[] array, int height) {
	        int answer = 0;
	        int cnt=0;
	        
	        //1. sort그냥 안쓰고 for문 끝까지 돌리는게 시간이 나을수도..?
	        Arrays.sort(array);
	        
	        for(int i=0;i<array.length;i++) {
	        	if(height<array[i]) {
	        		cnt=i;
	        		answer=  array.length-cnt;
	        		break;
	        	}
	        }
	   
	        return answer;
	    }
	    
	    public int solution1(int[] array, int height) {
	        int answer = 0;
	        //2.삼항 연산
	        for(int i:array) {
	        	answer+=i>height?1:0;
	        }
	   
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol=new Solution();
		int arr[]= {149, 180, 192, 170};
		int hei=167;
		sol.solution(arr,hei);
		sol.solution1(arr,hei);

		
		

	}

}
