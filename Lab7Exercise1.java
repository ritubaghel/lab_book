package labBook;

import java.util.*;

public class Lab7Exercise1 {

	public static void main(String[]args)
	{
		HashMap map=new HashMap();
		map.put(1,2);
		map.put(2,6);
		map.put(3,9);
		System.out.println(getValues(map));
	}

	private static List getValues(HashMap map) {
		
		Collection l=map.values();
		List list=new ArrayList(l);
		Collections.sort(list);
		return list;
		
	}
}
