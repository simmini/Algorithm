package 코딩테스트입문;

public class 가위바위보 {
	static class Solution {
	    public String solution(String rsp) {
	        String answer = "";
	        char[] arrch=rsp.toCharArray();
	        
	       	for(int i=0;i<arrch.length;i++) {
	       		
	       		if(arrch[i]=='2') {
	       			answer+='0';
	       		}
	       		else if(arrch[i]=='0') {
	       			answer+='5';
	       		}else if(arrch[i]=='5') {
	       			answer+='2';
	       		}
	       	}
	     
	        return answer;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution sol=new Solution();
		System.out.println(sol.solution("205"));
		
		
	}

}
