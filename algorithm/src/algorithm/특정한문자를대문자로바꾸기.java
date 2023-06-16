package algorithm;

public class 특정한문자를대문자로바꾸기 {

	
	static class Solution {
	    public String solution(String my_string, String alp) {
	        String answer = "";
	        answer=my_string.replace(alp,alp.toUpperCase());
	        return answer;
	    }
	}
	public static void main(String[] args) {
		String answer = "";
		String my_string="programmers";
		String alp="p";
		
		Solution a=new Solution();
		String b=a.solution(my_string, alp);
		System.out.println(b);
        
        

	}

}
