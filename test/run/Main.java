package test.run;

import testArrayProject.ArraySample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		다른 클래스 파일을 호출하는 방법.
		인스턴스(다른클래스) 해당 인스턴스의 별칭(변수명) = 새로 생성하겠다. new 인스턴스 명
		이렇게하면 해당 인스턴스를 바라보게 import 시키고
		해당 인스턴스에 작성했던 메소드 들이 다 대기된다.
		*/
		ArraySample solution = new ArraySample();
		
		
		solution.test3();
	}

}
