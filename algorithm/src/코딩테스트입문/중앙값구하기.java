package Programmers;

import java.util.Arrays;

import Programmers.배열원소의길이.Solution;

public class 중앙값구하기 {

	static class Solution {
	    public int solution(int[] array) {
	
	    	//1. 정석-나
	    	for(int j=0;j<array.length;j++) {
	    		for(int i=j;i<array.length;i++) {
	    			if(array[i]<array[j]) {
	    				int tmp=0;
	    				tmp=array[i];
	    				array[i]=array[j];
	    				array[j]=tmp;
	        		}
	        	}
	    	}
	   
	        int mid=array.length/2;
	        System.out.println(Arrays.toString(array));
	        System.out.println(array[mid]);
	        return array[mid];
	    }
	
	 public int solution1(int[] array) {
			
	    //2. sort함수
		 Arrays.sort(array);
		 int mid=array.length/2;
		 int mid1=array.length>>1; //5->101(2)->10(2)->2	    		
		 System.out.println(mid1+" "+mid);
		 return array[mid];
	    }
	}

	public static void main(String[] args) {
		Solution sol=new Solution();
		int arr[]= {10, 9, 7, 3, 5};
		sol.solution(arr);
		sol.solution1(arr);
	}

}

