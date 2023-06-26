package 코딩테스트입문;

import java.util.Arrays;

public class 최댓값만들기1 {

	
	static class Solution {
	    public int solution(int[] numbers) {
	        int answer = 0;
	        
	        Arrays.sort(numbers);
	        answer=numbers[numbers.length-1]*numbers[numbers.length-2];
	       System.out.println(answer);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []num= {1, 2, 3, 4, 5};

		Solution sol=new Solution();
		sol.solution(num);
	}

}
