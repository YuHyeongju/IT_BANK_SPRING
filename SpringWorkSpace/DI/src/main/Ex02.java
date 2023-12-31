package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import obj.Toy;

public class Ex02 {

	public static void main(String[] args) {
		GenericXmlApplicationContext gxac =
				new GenericXmlApplicationContext("classpath:appCtx.xml");
						
		
		Toy t1 = gxac.getBean(Toy.class);
		//클래스에 겹치는 bean이없으면 클래스명만 명시하면되고
		
		Toy t2 = gxac.getBean("toy",Toy.class);
		//클래스가 겹치면 id까지 명시해서 정확하게 가져올 수 있다.
		
		//스프링한테 장난감 꺼내봐라 하면 배터리가 끼워진 장난감을 준다.
		//똑같은 기능의 객체를 공유
		
		//냉장고 : 가족끼리살아도 하나 ->싱글톤 ,공통의 물건 
		
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2 + "\n");
		//- 해시코드가 동일하다.
		//- 객체하나를 가지고 돌려서 사용한다는 의미 (=싱글톤)
		
		//ex) 영화관 - 스크린 하나 좌석 사람수대로
		
		t1.run(); //배터리 끼운적도 없는데 혼자 동작중이다.
		t2.run();
		
		/*
		  스프링 이 관리하는 객체를 스프링 빈이라 한다.
		 주로 특정 xml 파일에 작성해서 사용한다.
		 
		 스프링빈은  스프링 컨테이너에서 관리되고 사용자(개발자)가 요청시 컨테니너에서 
		 해당 객체(bean)를 주입해준다.(DI) 여기서는 appCtx가 컨테이너이다.
		 
		 컨테이너 내에서 객체간의 의존성을 미리 주입해두면 사용자가 요청시 꺼낸 객체(빈)도
		 의존성이 주입된 상태로 꺼내준다.
		 
		IOC (Inverse of Control : 제어의 역전)
		사용자 주도의 프로그램 개발이 아닌 특정, 프로그램에 맞추어 개발을 진행하는 방식
		만든 이유 : 규격화 하기위해   
		스프링에 맞추어 개발을 해야지 스프링을 개발자에 맞추어 개발하지않음
		 
		*/
		 
	}

}
