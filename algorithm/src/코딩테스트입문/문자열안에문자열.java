package 코딩테스트입문;

import 코딩테스트입문.제곱수판별하기.Solution;

public class 문자열안에문자열 {

	static class Solution {
	    public int solution(String str1, String str2) {
	        int answer = 2;
	        if(str1.contains(str2)) {
	        	answer=1;
	        }
	        
	        System.out.println(answer);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		Solution sol=new Solution();
		String str1="ab6CDE443fgh22iJKlmn1o";
		String str2="6CD";
		sol.solution(str1,str2);

	}

}
