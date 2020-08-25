package com.yedam.lambda;

//함수적인터페이스(FunctionalInterface) => 메소드가 하나만 있는 인터페이스에만 람다식 사용 가능
interface MyFunctionalInterface {
	public void run(); //추상메소드(abstract method)
}

class MyFuncClass implements MyFunctionalInterface {
	@Override
	public void run() {
		System.out.println("ruuuuuuuuuun.");
	}
}

//원래식
//public class LambdaExample {
//	public static void main(String[] args) {
//		MyFunctionalInterface myintf = new MyFunctionalInterface() {
//					@Override
//					public void run() {
//						System.out.println("run!");
//					}
//				};
//				myintf.run();
//	}

//람다식
	public class LambdaExample {
		public static void main(String[] args) {
			MyFunctionalInterface myintf = () -> {System.out.println("run!");}; //() =>매개값
					myintf.run();

			//원래식 2		
//			ShowContent sc = new ShowContent() {
//				@Override
//				public void show(String content) {
//					System.out.println("내용은 " + content + " 입니다.");
//				}
//			};
//					sc.show("바나나");
					
			//람다식2
			ShowContent sc = (content) -> {
				System.out.println("내용은 " + content + " 입니다.");
			};
			sc.show("바나나");
			
			//원래식3
//			ShowContent sc2 = new ShowContent() {
//				@Override
//				public void show(String content) {
//					System.out.println("this is" + content);
//				}
//			};
//			sc2.show("banana");
			
			//람다식3
			ShowContent sc2 = (content) -> {
				System.out.println("this is " + content);
			};
			sc2.show("banana"); 
		
			//일반식4
//			Calculator cal = new Calculator() {
//				@Override
//				public int sum(int a, int b) {
//					return a+b;
//				}
//			};
//			System.out.println("결과: " + cal.sum(10, 5));
			
			//람다식4		
		Calculator cal = (a, b) -> a+b;
		System.out.println("결과: " + cal.sum(10, 5));

		}//end of main
}//end of class
