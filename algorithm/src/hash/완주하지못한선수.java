package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 완주하지못한선수 {

	 static class solSort{
		
		public String sol (String[]Part ,String []Comp) {
			

			Arrays.sort(Part);
			Arrays.sort(Comp);
			
			int i;
			for( i=0;i<Comp.length;i++) {
				
				if(!Part[i].equals(Comp[i])) {
					
					break;
				}
				
					
				
				
			}
			return Part[i];
			
		
    	
	}
	 }	 	
	public static void main(String[] args) {
		
		String []a={"a","b","c"};//{"leo", "kiki", "eden"};
		String []b= {"a","b"};//{"eden", "kiki"};
		solSort solS= new solSort();
		String  cb=solS.sol(a,b);
	
		System.out.println(cb);
	}
 


	 
}