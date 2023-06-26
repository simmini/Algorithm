package 코딩테스트입문;

import java.util.Arrays;

public class 배열자르기 {

	
	static class Solution {
	    public int[] solution(int[] numbers, int num1, int num2) {
	        int[] answer = new int[num2-num1+1];
	        int cnt=0;
	        //1. for문-나의풀이
	        for(int i=num1;i<=num2;i++) {
	        	answer[cnt++]=numbers[i];
	        }
	        //2. copyOfRange(복사하고자하는 배열,시작위치,끝인덱스+1)
	        int []answer1=Arrays.copyOfRange(numbers, num1, num2+1);
	        System.out.println(Arrays.toString(answer1));
	        
	        
	        return answer;
	    }
	}
	public static void main(String[] args) {
		
		int numbers[]= {1,2,3,4,5};
		Solution sol=new Solution();
		sol.solution(numbers, 1, 3);
		
		
	}

}
