package s02_Set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex03_LinkedHashSetMethod {

	public static void main(String[] args) {

		// 객체 1
		Set<String> linkedSet1 = new LinkedHashSet<>();

		// 1. add(E element)
		linkedSet1.add("가");
		linkedSet1.add("나");
		linkedSet1.add("가");
		System.out.println("1. " + linkedSet1.toString()); // [가 나]

		// 객체 2
		Set<String> linkedSet2 = new LinkedHashSet<>();

		// 2. addAll
		linkedSet2.add("나");
		linkedSet2.add("다");
		linkedSet2.addAll(linkedSet1);
		System.out.println("2. " + linkedSet2.toString()); // [나, 다, 가]

		// 3. remove(Object o)
		linkedSet2.remove("나");
		System.out.println("3. " + linkedSet2.toString()); // [다, 가]

		// 4. clear()
		linkedSet2.clear();
		System.out.println("4. " + linkedSet2.toString()); // []

		// 5. isEmpty();
		System.out.println("5. " + linkedSet2.isEmpty()); // true

		// 6. contains (Object o)
		System.out.println("6. ");
		Set<String> linkedSet3 = new LinkedHashSet<>();
		linkedSet3.add("가");
		linkedSet3.add("나");
		linkedSet3.add("다");
		System.out.println(" " + linkedSet3.contains("나")); // true
		System.out.println(" " + linkedSet3.contains("라")); // false

		// 7. size()
		System.out.println("7. " + linkedSet3.size()); // 3

		// 8. iterator()
		System.out.println("8. ");
		Iterator<String> iterator = linkedSet3.iterator();

		while (iterator.hasNext()) { // 총 3바퀴

			System.out.println(" " + iterator.next()); // 가, 나, 다

		}

		// 9. toArray()
		System.out.println("9. ");
		Object[] objArray = linkedSet3.toArray();
		System.out.println(" " + Arrays.toString(objArray));  // [가, 나, 다]

		// 10-1. toArray(T[] t)
		String[] strArray1 = linkedSet3.toArray(new String[0]);
		System.out.println(" " + Arrays.toString(strArray1)); // [가, 나, 다]

		// 10-2. toArray(T[] t)
		String[] strArray2 = linkedSet3.toArray(new String[5]);
		System.out.println(" " + Arrays.toString(strArray2)); // [가, 나, 다, null, null]

	}

}
