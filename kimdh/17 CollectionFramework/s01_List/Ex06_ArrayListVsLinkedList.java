package s01_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex06_ArrayListVsLinkedList {

	public static void main(String[] args) {

		// 초기화
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime = 0, endTime = 0;
		long result1 = 0, result2 = 0;

		// 1. 추가 시간

		// @1-1 ArrayList 데이터 추가시간
		startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {

			aList.add(0, i);

		}

		endTime = System.nanoTime();

		result1 = endTime - startTime;
		System.out.println("ArrayList 데이터 추가시간 = " + (endTime - startTime) + " ns");

		// @1-2 LinkedList 데이터 추가시간
		startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {

			linkedList.add(0, i);

		}

		endTime = System.nanoTime();

		result2 = endTime - startTime;
		System.out.println("LinkedList 데이터 추가시간 = " + (endTime - startTime) + " ns");
		System.out.println("차이: " + result1 / result2);

		System.out.println();

		// 2. 검색 시간

		// @2-1 ArrayList 데이터 검색시간
		startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {

			aList.get(i);

		}

		endTime = System.nanoTime();

		result1 = endTime - startTime;
		System.out.println("ArrayList 데이터 검색시간 = " + (endTime - startTime) + " ns");

		// @2-2 LinkedList 데이터 검색시간
		startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {

			linkedList.get(i);

		}

		endTime = System.nanoTime();

		result2 = endTime - startTime;
		System.out.println("LinkedList 데이터 검색시간 = " + (endTime - startTime) + " ns");
		System.out.println("차이: " + result2 / result1);

		System.out.println();

		// 3. 제거 시간

		// @3-1 ArrayList 데이터 제거시간
		startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {

			aList.remove(0);

		}

		endTime = System.nanoTime();

		result1 = endTime - startTime;
		System.out.println("ArrayList 데이터 제거시간 = " + (endTime - startTime) + " ns");

		// @3-2 LinkedList 데이터 제거시간
		startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {

			linkedList.remove(0);

		}

		endTime = System.nanoTime();

		result2 = endTime - startTime;
		System.out.println("LinkedList 데이터 제거시간 = " + (endTime - startTime) + " ns");
		System.out.println("차이: " + result1 / result2);

	}

}
