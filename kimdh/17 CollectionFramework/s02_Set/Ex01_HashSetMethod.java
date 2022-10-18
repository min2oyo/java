package s02_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01_HashSetMethod {

	public static void main(String[] args) {

		// 객체 1
		Set<String> hSet1 = new HashSet<>();

		// 1. add(E element)
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("가");
		System.out.println("1. " + hSet1.toString()); // [가 나]

		// 객체 2
		Set<String> hSet2 = new HashSet<>();

		// 2. addAll(다른 set 객체)
		hSet2.add("나");
		hSet2.add("다");
		hSet2.addAll(hSet1);
		System.out.println("2. " + hSet2.toString()); // [가, 다, 나]

		// 3. remove(Object o)
		hSet2.remove("나");
		System.out.println("3. " + hSet2.toString()); // [가, 다]

		// 4. clear()
		hSet2.clear();
		System.out.println("4. " + hSet2.toString()); // []

		// 5. isEmpty();
		System.out.println("5. " + hSet2.isEmpty()); // true

		// 객체 3
		Set<String> hSet3 = new HashSet<>();

		// 6. contains (Object o)
		System.out.println("6. ");
		hSet3.add("가");
		hSet3.add("나");
		hSet3.add("다");
		System.out.println(" " + hSet3.contains("나")); // true
		System.out.println(" " + hSet3.contains("라")); // false

		// 7. size()
		System.out.println("7. " + hSet3.size()); // 3

		// 8. iterator()
		System.out.println("8. ");
		Iterator<String> iterator = hSet3.iterator();

		while (iterator.hasNext()) { // 총 3바퀴

			System.out.println(" " + iterator.next());

		}

		// 9. toArray()
		Object[] objArray = hSet3.toArray();
		System.out.println("9. " + Arrays.toString(objArray));  // [가, 다, 나]

		// 10-1. toArray(T[] t)
		String[] strArray1 = hSet3.toArray(new String[0]);
		System.out.println("10-1. " + Arrays.toString(strArray1)); // [가, 다, 나]

		// 10-2. toArray(T[] t)
		String[] strArray2 = hSet3.toArray(new String[5]);
		System.out.println("10-2. " + Arrays.toString(strArray2)); // [가, 다, 나, null, null]

	}

}
