// 추상 클래스를 만들 땐, public을 지우고 abstract 클래스로 바꿔 주어야 한다.
abstract class Player {
	abstract void play(String songName);
	abstract void pause();
	abstract void stop();
}
