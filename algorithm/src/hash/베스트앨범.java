package hash;

import java.util.HashMap;

public class 베스트앨범 {
	static class Solution {
	    public int[] solution(String[] genres, int[] plays) {
	        int[] answer = {};
	        HashMap<String, Integer> map=new HashMap<>();
	        int cnt=0;
	        for(int i=0;i<genres.length;i++) {
	        	
	        	map.put(genres[i], plays[i]);
	        }
	        
	        
	        
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		
		String []genres= {"classic", "pop", "classic", "classic", "pop"};
		int[] plays= {500, 600, 150, 800, 2500};
		Solution sol=new Solution();
		System.out.println(sol.solution(genres, plays));
	}

}
