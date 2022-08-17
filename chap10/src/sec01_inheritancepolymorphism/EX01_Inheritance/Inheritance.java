package sec01_inheritancepolymorphism.EX01_Inheritance;

class Human{
	String name ;
	int age ;
	void eat() {}
	void sleep() {}
	
}

class Student extends Human{
	int studentID ;
	void goTOSchool() {}
	
}

class Worker extends Human{
	int workerID ;
	void goToWork() {}
}

public class Inheritance {
	public static void main(String[] args) {
		//Human 객체 생성
		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();
		System.out.println("Human");
		System.out.println("이름: " + h.name + " 나이: " + h.age);
		
		//Student 객체 생성
		Student s = new Student();
		s.name = "김민성";
		s.age = 16;
		s.studentID = 128; //추가로 정의한 멤버
		s.eat();
		s.sleep();
		s.goTOSchool();
		System.out.println("Student");
		System.out.println("이름: " + s.name + " 나이: " + s.age);

		
		//Worker 객체 생성
		Worker w = new Worker();
		w.name = "봉윤정";
		w.age = 45;
		w.workerID = 128; //추가로 정의한 멤버
		w.eat();
		w.sleep();
		w.goToWork();
		System.out.println("Worker");
		System.out.println("이름: " + w.name + " 나이: " + w.age);

		


	}

}
