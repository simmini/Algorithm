package 코딩테스트입문;

import java.util.Arrays;

public class 아이스아메리카노 {
	static class Solution {
	    public int[] solution(int money) {
	        int[] answer = {0,0};
	       //1.갑 대입
	        answer[0]=money/5500;
	        answer[1]=money%5500;
	        System.out.println(Arrays.toString(answer));
	      //return answer;
	        
	        //2. 바로 {}안에 식넣어버리기
	        return new int[] {money/5500,money%5500};
	        
	    }
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution sol=new Solution();
		sol.solution(15000);
	}

}
