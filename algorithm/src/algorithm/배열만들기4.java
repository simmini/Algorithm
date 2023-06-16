package algorithm;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기4 {
	static class Solution {
	    public int[] solution(int[] arr) {
	        int[] stk = {};
	        
	        List<Integer> list = new ArrayList<>();
	        list.add(arr[0]);
	        for (int i = 1; i < arr.length; i++) {
	           //list.add(arr[i]);
	           System.out.println(list.get(i));
	           System.out.println(list.get(0));
	           int a=i-1;
	           if(arr[a]>= arr[i] ) {
	        	   list.add(arr[i]);
	        	   }
	           System.out.println(list.get(a));
//	           if (list.get(a) >= list.get(i)) {
	              //System.out.println( list.remove(i));
//	           }

	        }
	        return list.stream().mapToInt(i -> i).toArray();
	     }
	        
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,4,3,5,3};
		
		Solution sol=new Solution();
		sol.solution(arr);

	}

}
