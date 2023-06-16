package algorithm;

public class 문자열정수의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num_str="123456789";
		int  sum=0;
		for(int i=0;i<num_str.length();i++) {
			
			sum+=Integer.parseInt(num_str.split("")[i]);
		
		}
	
		System.out.println(sum);
	}

}
