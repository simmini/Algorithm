package stackandQ;

import java.util.ArrayList;
import java.util.Arrays;



public class 같은숫자는싫어 {
	
	static public class Solution {
	    public int[] solution(int []arr) {
	        int[] answer = {};
	        
	        ArrayList<Integer> list=new ArrayList<>();
	       
	        
	        int num=arr[0];
	        list.add(num);
	        //리스트에서 중복값을 찾는 경우 
	        for(int i=1;i<arr.length;i++) {
	        
	        	if(num!=arr[i]) {
	        		list.add(arr[i]);
	        		num=arr[i];//이거 생각 못함!!
	        	}
	        	
	        }        
	    answer=list.stream().mapToInt(i->i).toArray();//list->array
	    System.out.println(Arrays.toString(answer)+"?");
	    return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,3,3,0,1,1};
		Solution sol=new Solution();
		sol.solution(arr);
	}

}
