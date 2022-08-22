package arrayList;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al =new ArrayList();
		al.add(10);
		al.add("skuila");
		al.add(true);
		
//		System.out.println(al.size());
//		System.out.println(al);
		
		//remove
		//al.remove(0);
		System.out.println(al);

		al.add("skuila00");
		al.add(false);
		System.out.println(al);
		
		//fetch
		
		//System.out.println(al.get(0));
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(i);
//			System.out.println(al.get(i));
//		}
		for(Object obj:al)
		{
			System.out.println(obj );
		}
	}

}
