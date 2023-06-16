package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class iterator과stream비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3));
		
		//Iterator사용
		Iterator<Integer> iter=list.iterator();
		while(iter.hasNext()) {
			int num=iter.next();
			System.out.println(num);
		}
		//Stream사용
		Stream<Integer>stm=list.stream();
		stm.forEach(num->System.out.println(num));
		
	}

}
