/*
	9강~17강까지 객체 지향 프로그래밍 ㅡ
		사용자 정의 함수
		반복 함수와 재귀 함수
		배열
		다차원 배열
		클래스
		상속
	ㅡ 을 배웠음.
	
	18강부터는 앞서 배운 객체 지향 기법을 활용하는 방법에 대해 공부. (심화?)
		자바의 대표적 개념으로 추상(Abstract)이 있으며 그와 비슷하지만 조금 다른 개념인 인터페이스의 개념이 존재.
		이외에도 최종(Final), 다형성, 객체(Object) 등을 배울 예정.
	
	18강 주제 : 추상
		추상? === 미완성 클래스.
			추상 클래스는 직접적으로 객체 인스턴스를 생성할 수 없다.
			하지만 새로운 클래스를 작성하는 데 밑바탕이 되는 역할을 해 준다는 것에서 의미가 있다.
			즉, 어느 정도 미리 "설계"로서 틀을 갖추고 클래스를 작성할 수 있게 한다는 기능적인 측면에서 의미가 있다.
		
			추상 클래스를 사용하려면 꼭 상속을 받아야 하며,
			상속받은 모든 추상 메소드는 반드시 구현을 해 주어야 한다.
		
		1. 추상의 개념을 이용하여 음악 플레이어 클래스를 구현.
			해당 파일 전체 + Player.java
			
		2. 추상의 개념을 이용해 동물 클래스를 구현.
			Main2 + Animal + Cat + Dog
*/

// 우선은 extends 클래스명(= Player)을 써서 상속 받는다. 경고 줄에 마우스 올리면 Add unimplemented methods가 뜸. 아직 구현 안 된 함수를 구현하라는 거임.
public class Main extends Player {

	public static void main(String[] args) {
		
/*		play("Joakim Karud - Mighty Love");		*/		
		/* 이대로만 하면 오류가 발생함.
			main 메소드는 main 클래스 안에서 공유하는 static이라고 선언된 하나의 메소드라 할 수 있는데, static이라는 메소드 안에서 play라고 하는 생뚱 맞은 메소드를 불러오려 했기 때문임.
			다른 메소드(= play)를 불러오려면 불러와지는 메소드 또한 static으로 선언 돼야 함.
		*/
		
		// 그러니 이런 식으로 하자.
		
		Main main = new Main();
		main.play("Joakim Karud - Mighty Love");
		main.pause();
		main.stop();
		
	}
	
// 위에서 봤던 기능 쓰면 @어쩌구가 자동으로 만들어짐. 즉, 추상 클래스에는 간단한 것들만 써 놓고, 여기서 자동 완성 시킨다?
	
	@Override
	void play(String songName) {
		
		System.out.println(songName + " 곡을 재생합니다.");
		
	}

	@Override
	void pause() {
		
		System.out.println("곡을 일시 정지합니다.");
		
	}

	@Override
	void stop() {
		
		System.out.println("곡을 정지합니다.");
		
	} // 여기까지 봤으면 다시 올라가서, 사용해 보기 위한 코드 보기.

}
