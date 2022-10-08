package sec01_inheritancepolymorphism.EX01_Inheritance;

/* 클래스의 상속과 사용가능한 멤버 */

class Human {

	String name;
	int age;

	void eat() {

	}

	void sleep() {

	}

}

class Student extends Human {

	int studentID;

	void goToSchool() {

	}

}

class Worker extends Human {

	int workerID;

	void goToWork() {

	}

}

public class Inheritance {

	public static void main(String[] args) {

		// #1. Human 객체 생성

		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();
		System.out.println(h.name + " " + h.age); // 김현지 11

		// #2. Student 객체 생성

		Student s = new Student();
		s.name = "김민성";
		s.age = 16;
		s.studentID = 128;
		s.eat();
		s.sleep();
		s.goToSchool();
		System.out.println(s.name + " " + s.age + " " + s.studentID); // 김민성 16 128

		// #3. Worker 객체 생성

		Worker w = new Worker();
		w.name = "봉윤정";
		w.age = 45;
		w.workerID = 128;
		w.eat();
		w.sleep();
		w.goToWork();
		System.out.println(w.name + " " + w.age + " " + w.workerID); // 봉윤정 45 128

	}

}
