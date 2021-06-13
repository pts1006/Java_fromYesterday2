// Animal 이라는 클래스를 상속받은 모든 클래스들은 crying 이라는 함수를 반드시 구현해야 한다.
abstract class Animal {
	abstract void crying();
}
// 이로 인해 Cat과 Dog 클래스는 공통적인 특성을 가지게 됐다.