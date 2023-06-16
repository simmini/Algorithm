package algorithm;

public class 수열과구간쿼리3 {
	static class Solution {
	    public int[] solution(int[] arr, int[][] queries) {
	        int[] answer = {};
	        
	        for(int i=0;i<queries.length;i++) {//행
	        	//열
	        	int tmp=arr[queries[i][0]];
	        	arr[queries[i][0]]=arr[queries[i][1]];
	        	arr[queries[i][1]]=tmp;
	        	
	        }
	        
	        
	        return arr;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []arr= {0, 1, 2, 3, 4};
			int queries[][]= {{0, 3},{1, 2},{1, 4}};
	
			Solution sol=new Solution();
			
			int []a=sol.solution(arr, queries);
			for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			
			}


	
	}}
