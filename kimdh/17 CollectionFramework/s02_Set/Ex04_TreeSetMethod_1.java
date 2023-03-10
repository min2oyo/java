package s02_Set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ex04_TreeSetMethod_1 {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();

		for (int i = 50; i > 0; i -= 2) {

			treeSet.add(i);

		}

		// 0. Start
		System.out.println("0. " + treeSet.toString());	// [2, 4, 6, ..., 50]

		// 1. first()
		System.out.println("1. " + treeSet.first());	// 2

		// 2. last()
		System.out.println("2. " + treeSet.last());	// 50

		// 3. lower(E element)
		System.out.println("3. " + treeSet.lower(26));	// 24

		// 4. higher(E element)
		System.out.println("4. " + treeSet.higher(26));	// 28

		// 5. floor(E element)
		System.out.println("5. ");
		System.out.println(" " + treeSet.floor(25));	// 24
		System.out.println(" " + treeSet.floor(26));	// 26

		// 6. ceiling(E element)
		System.out.println("6. ");
		System.out.println(" " + treeSet.ceiling(25));	// 26
		System.out.println(" " + treeSet.ceiling(26));	// 26

		// 7. pollFirst()
		System.out.println("7. ");
		int treeSetSize = treeSet.size();
		System.out.println(" " + treeSetSize);	// 25

		for (int i = 0; i < treeSetSize; i++) {

			System.out.print(" " + treeSet.pollFirst() + " ");	// 2 4 6 8 10 12 14 ... 50

		}

		System.out.println();
		System.out.println(" " + treeSet.size());	// 0

		// 8. pollLast()
		System.out.println("8. ");

		for (int i = 50; i > 0; i -= 2) {

			treeSet.add(i);

		}

		treeSetSize = treeSet.size();	// 25

		for (int i = 0; i < treeSetSize; i++) {

			System.out.print(" " + treeSet.pollLast() + " ");	// 50 48 46 44 42 40 ... 2

		}

		System.out.println();
		System.out.println(" " + treeSet.size());	// 0

		// 9. SortedSet<E> headSet(E element)
		System.out.println("9. ");

		for (int i = 50; i > 0; i -= 2) {	// [2, 4, 6, ..., 50]

			treeSet.add(i);

		}

		SortedSet<Integer> sSet = treeSet.headSet(20);
		System.out.println(" " + sSet.toString());	// [2, 4, 6, 8, 10, 12, 14, 16, 18]

		// 10. NavigableSet<E> headSet(E element, boolean inclusive)
		System.out.println("10. ");
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);
		System.out.println(" " + nSet.toString());	// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
		nSet = treeSet.headSet(20, false);
		System.out.println(" " + nSet.toString());	// [2, 4, 6, 8, 10, 12, 14, 16, 18]

		// 11. SortedSet<E> tailSet(E element)
		sSet = treeSet.tailSet(20);
		System.out.println("11. " + sSet.toString());	// [20, 22, 24, ..., 50]

		// 12. NavigableSet<E> tailSet(E element, boolean inclusive)
		System.out.println("12. ");
		nSet = treeSet.tailSet(20, true);
		System.out.println(" " + nSet.toString());	// [20, 22, 24, ..., 50]
		nSet = treeSet.tailSet(20, false);
		System.out.println(" " + nSet.toString());	// [22, 24, ..., 50]

		// 13. SortedSet<E> subSet(E element, E element)
		sSet = treeSet.subSet(10, 20);
		System.out.println("13. " + sSet.toString());	// [10, 12, ... , 18]

		// 14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
		System.out.println("14. ");
		nSet = treeSet.subSet(10, true, 20, false);
		System.out.println(" " + nSet.toString());	// [10, 12, ... , 18]
		nSet = treeSet.subSet(10, false, 20, true);
		System.out.println(" " + nSet.toString());	// [12, 14, ... , 20]

		// 15. NavigableSet<E> descendingSet()
		System.out.println("15. ");
		System.out.println(" " + treeSet);	// ????????????
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(" " + descendingSet);	// ????????????
		descendingSet = descendingSet.descendingSet();
		System.out.println(" " + descendingSet);	// ????????????

	}

}
