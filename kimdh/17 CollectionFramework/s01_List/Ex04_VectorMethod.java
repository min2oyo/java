package s01_List;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Ex04_VectorMethod {

	public static void main(String[] args) {

		// 객체 생성 1
		List<Integer> vector1 = new Vector<Integer>();

		// 1. add(E element)
		vector1.add(3);
		vector1.add(4);
		vector1.add(5);
		System.out.println("1. vector1: " + vector1.toString()); // [3, 4, 5]

		// 2. add(int index, E element)
		vector1.add(1, 6);
		System.out.println("2. vector1: " + vector1.toString()); // [3, 6, 4, 5]

		// 객체 생성 2
		List<Integer> vector2 = new Vector<>();

		// 3. addAll(또 다른 리스트 객체)
		vector2.add(1);
		vector2.add(2);
		vector2.addAll(vector1);
		System.out.println("3. vector2: " + vector2); // [1, 2, 3, 6, 4, 5]

		// 객체 생성 3
		List<Integer> vector3 = new Vector<>();

		// 4. addAll(int index, 또 다른 리스트 객체)
		vector3.add(1);
		vector3.add(2); // [1 2]
		vector3.addAll(1, vector3);
		System.out.println("4. vector3: " + vector3); // [1, 1, 2, 2]

		// 5. set(int index, E element)
		vector3.set(1, 5);
		vector3.set(3, 6);
		// aList3.set(4,7); //java.lang.IndexOutOfBoundsException:
		System.out.println("5. vector3: " + vector3); // [1, 5, 2, 6]

		// 6. remove(int index)
		vector3.remove(1); // 1번 인덱스를 삭제해라
		System.out.println("6. vector3: " + vector3); // [1, 2, 6]

		// 7. remove(Object o)
		vector3.remove(new Integer(2));
		System.out.println("7. vector3: " + vector3); // [1, 6]

		// 8. clear()
		vector3.clear();
		System.out.println("8. vector3: " + vector3); // []

		// 9. isEmpty()
		System.out.println("9. vector3: " + vector3.isEmpty()); // true

		// 10. size()
		System.out.println("10.");
		System.out.println(" vector3: " + vector3.size());	// 0
		vector3.add(1);
		vector3.add(2);
		vector3.add(3);
		System.out.println(" vector3: " + vector3); 				// [1, 2, 3]
		System.out.println(" vector3: " + vector3.size());	// 3

		// 11.get(int index)
		System.out.println("11.");
		System.out.println(" 0번째 : " + vector3.get(0)); // 1
		System.out.println(" 1번째 : " + vector3.get(1)); // 2
		System.out.println(" 2번째 : " + vector3.get(2)); // 3
		for (int i = 0; i < vector3.size(); i++) System.out.println(" " + i + "번째 : " + vector3.get(i));

		// 12. toArray() List-->Array
		Object[] object = vector3.toArray();
		System.out.println("12. vector3: " + Arrays.toString(object)); // [1, 2, 3]

		// 13-1. toArray(T[] t) --> T[]
		Integer[] integer1 = vector3.toArray(new Integer[0]);
		System.out.println("13-1. vector3: " + Arrays.toString(integer1));	// [1, 2, 3]

		// 13-2. toArray(T[] t) --> T[]
		Integer[] integer2 = vector3.toArray(new Integer[5]);
		System.out.println("13-2. vector3: " + Arrays.toString(integer2));	// [1, 2, 3, null, null]

	}

}
