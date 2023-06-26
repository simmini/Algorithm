package 코딩테스트입문;

import 코딩테스트입문.문자열안에문자열.Solution;

public class 숨어있는숫자의덧셈1 {

	
		static class Solution {
		    public int solution(String my_string) {
		        int answer = 0;
		        char ch[]=my_string.toCharArray();
		        for(int i=0;i<ch.length;i++) {
		        	//System.out.println(ch[i]);
		        	if(ch[i]>48&&ch[i]<58) {
		        		answer+=Integer.valueOf(ch[i]);
		        		System.out.println(answer);
		        	}
		        }
		        
		        System.out.println(answer);
		        
		        return answer;
		    }
		}
		
		
		public static void main(String[] args) {
			Solution sol=new Solution();
			String str1="aAb1B2cC34oOp";
			
			sol.solution(str1);

		}

	

}
