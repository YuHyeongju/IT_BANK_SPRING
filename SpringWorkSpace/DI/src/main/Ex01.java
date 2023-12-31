package main;

import obj.Battery;
import obj.Toy;

public class Ex01 {
	public static void main(String[] args) {
		Toy t1 = new Toy();  
		Toy t2 = t1;		//참조변수를 대입으로 복사시 가리키는 대상(객체)가 같아짐
							//참조 변수는 객체가 아니다.
		
		Toy t3  = new Toy();
		
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);
		//해쉬코드가 같다 = 같은 것을 참조
		//해쉬코드가 다르다 = 다른 것을 참조
		
		//같은 대상을 가리키는 참조변수는 동일한 해시코드를 가진다.
		
		Battery bat = new Battery();
		
		t1.setBat(bat);
		
		//t3는 배터리가 주입이 안 된 다른객체라 작동이 안됨
		
		
		t1.run();
		t2.run();
		t3.run();
	}
}
