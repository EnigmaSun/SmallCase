package test_Niuke;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Solution3 {
	public int singleNumber(int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : A) {
			if (map.get(i) != null) {
				Integer value = map.get(i);
				map.put(i, value + 1);
			}else{
				map.put(i, 1);
			}
		}
		Set<Integer> ks = map.keySet();
		Iterator<Integer> it = ks.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			Integer value = map.get(key);
			if (value.equals(1)) {
				return key;
			}
		}
		return (Integer)0;
    }
    

	public static void main(String[] args) {
		int[] A =new int[]{12,12,33,33,44,55,55};
		Solution3 s3=new Solution3();
		System.out.println(s3.singleNumber(A));
	}

}
