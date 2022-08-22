package wrapper;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> hm1 = new HashMap<String,String>();
		hm1.put("qa", "skuila.com/qa");
		hm1.put("uat", "skuila.com/uat");
		hm1.put("preprod", "skuila.com/preprod");
		hm1.put("prod", "skuila.com/prod");
		System.out.println(hm1);
///////////////////////////////////////////////////////////////////////////		
		for(String key:hm1.keySet()) 
		{
			System.out.println("key is :"+key+" value is :"+hm1.get(key));
		}
/////////////////////////////////////////////////////////////////////////////		
		HashMap<String, Integer> hm2 = new HashMap<String,Integer>();
		hm2.put("qa", 10);
		hm2.put("qa1", 20);
		hm2.put("qa2", 30);
		hm2.put("qa3", 40);
		System.out.println(hm2);
		//Set s =hm1.keySet();
		for(String key:hm2.keySet()) 
		{
			System.out.println("key is :"+key+" value is :"+hm2.get(key));
		}

	}

}
