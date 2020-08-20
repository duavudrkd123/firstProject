package com.yedam.generic;

//책 666p 그림 참고!
public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		//<?>는 모든 타입을 다 받음 
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		//<? extends Student>는 학생클래스를 상속받는 클래스만 올 수 있다는 의미
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		//<? super Worker>는 Worker클래스나 Worker클래스보다 상위의 클래스만 받겠다는 의미 
	}
	
	public static void main(String[] args) {
		Course<Person> crsPerson = new Course<>("일반인과정", 5);
		crsPerson.add(new Person("일반인1"));
		crsPerson.add(new Worker("직장인1"));
		crsPerson.add(new Student("학생1"));
		crsPerson.add(new HighStudent("고등학생1"));
		
		Course<Worker> crsWorker = new Course<>("직장인과정", 5);
//		crsWorker.add(new Person("일반인2"));
		crsWorker.add(new Worker("직장인2"));
//		crsWorker.add(new Student("학생2"));
//		crsWorker.add(new HighStudent("고등학생2"));
		
		Course<Student> crsStudent = new Course<>("학생과정", 5);
//		crsStudent.add(new Person("일반인3"));
//		crsStudent.add(new Worker("직장인3"));
		crsStudent.add(new Student("학생3"));
		crsStudent.add(new HighStudent("고등학생3"));
		
		Course<HighStudent> crsHighStudent = new Course<>("고등학생과정", 5);
//		crsHighStudent.add(new Person("일반인4"));
//		crsHighStudent.add(new Worker("직장인4"));
//		crsHighStudent.add(new Student("학생4"));
		crsHighStudent.add(new HighStudent("고등학생4"));
		
		// 일반인 등록 가능
		registerCourse(crsPerson); //모든 타입을 받을 수 있다!
		registerCourse(crsWorker);
		registerCourse(crsStudent);
		registerCourse(crsHighStudent);
		
		// 직장인 등록 가능
		registerCourseWorker(crsPerson);
		registerCourseWorker(crsWorker);
//		registerCourseWorker(crsStudent); //Worker클래스나 Worker클래스의 상위 클래스만 받을 수 있다!
//		registerCourseWorker(crsHighStudent);
		
		// 학생 등록 가능
//		registerCourseStudent(crsPerson); //학생클래스를 상속받는 클래스만 올 수 있다
//		registerCourseStudent(crsWorker);
		registerCourseStudent(crsStudent);
		registerCourseStudent(crsHighStudent);
		
		// 고등학생 등록 가능
		
	}
}
