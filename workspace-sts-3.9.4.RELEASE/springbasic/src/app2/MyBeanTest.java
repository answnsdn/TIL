package app2;

public class MyBeanTest {
/*
 *  oop가 적용되어 있는 프로그램
 *  oop특성을 적용하기 위해 상위클래스를 정의하고 MyBeanStyleXXX 클래스를 사용하는 매개변수
 *  타입을 상위타입으로 변경하며 다형성을 적용했다.
 *  사용되는 객체가 변경되더라도 변경된 객체를 사용하는 곳에서 코드를 수정하는 범위는 줄어든다.
 *  
 *  그러나 실제 객체를 전달하는 곳에서 생성하여 전달하고 있다.
 *  사용하는 객체가 바뀔때마다 객체를 직접 생성하는 코드를 모두 수정해야 한다는 단점이 존재한다.
 *  사용하는 곳에서 직접 new해서 객체를 생성하는 코드는 없어져야 하는 코드
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBeanStyleA obj = new MyBeanStyleA();
		run(obj);

	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*****************");
		obj.hello("현빈");
		System.out.println("*****************");
		
	}

}
