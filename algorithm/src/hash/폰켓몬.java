package hash;

import java.util.HashSet;
import java.util.Scanner;


public class 폰켓몬 {

	class Solution {
	    public int solution(int[] nums) {
	        int answer = 0;
	        int N=nums.length/2;
	        HashSet<Integer> hs=new HashSet<Integer>();
	        for(int n:nums) {
	        	hs.add(n);
	        }
	        if(hs.size()>N)return N;
	        else return hs.size();
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]nums;
		
		System.out.println("11");
		
		
	}
	
	

}
