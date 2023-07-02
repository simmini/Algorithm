package 기초;

import java.util.ArrayList;
import java.util.Arrays;

public class 왼쪽오른쪽 {
	
	
	static class Solution {
	    public String[] solution(String[] str_list) {
	        String[] answer = new String[str_list.length];
	        ArrayList<String> list=new ArrayList<>();
	        int cnt=0;
	        int num=0;
	        for(int i=0;i<str_list.length;i++) {
	        	if(str_list[i].equals("l")&&cnt==0) {
	        		cnt=1;
	        		num=i;
	        		break;
	        		
	        	}else if(str_list[i].equals("r")&&cnt==0){
	        		cnt=2;
	        		num=i;
	        		break;
	        		
	        	}	     
	        	
	        }
	        
	        if(cnt==1) {
	        	for(int j=0;j<num;j++) {
	        		list.add(str_list[j]);	
	        	}
	        	
	        }else if(cnt==2) {
	        	for(int j=num+1;j<answer.length;j++) {
	        		list.add(str_list[j]);
	        	}
	        	
	        }
	        answer=list.toArray(new String[list.size()]);
	        System.out.println(Arrays.toString(answer));
	        
	        return answer;
	    }
	}
	
	
	
	public static void main(String[] args) {
		
		String str[]={"u", "u", "l", "r"};
		String str1[]={"l"};
		Solution sol=new Solution();
		
		sol.solution(str);
		
		
		
	}

}
