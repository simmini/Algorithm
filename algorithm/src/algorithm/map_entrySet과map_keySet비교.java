package algorithm;

import java.util.HashMap;
import java.util.Map;

public class map_entrySet과map_keySet비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String,String> map=new HashMap<>();
		
		
		map.put("1","value1" );
		map.put("2", "value2");
		
		//keySet사용
		for(String key:map.keySet() ) {
			System.out.println("key: "+key+" ,value: "+map.get(key));
		}
		
		//entrySet사용 
		for(Map.Entry<String, String>mapTmp :map.entrySet()) {
			
			System.out.println("key: "+ mapTmp.getKey()+" ,value: "+mapTmp.getValue());
		}
	}

}
