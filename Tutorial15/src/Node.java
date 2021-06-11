
public class Node {
	// Node 클래스를 만들 때는 메인을 체크하지 않는다. (이미 있으니까.)
	private int x;
	private int y;		// private으로 만든 이유는, 외부(본문)에서 접근(변경)할 수 없도록 하기 위함. (좌표는 소중.)

	// 그럼에도 x와 y의 값을 가져오기 위해 밑에 처럼 쓰는 것.
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;		// 여기서 this 란? === x라는 고유한 속성의, 값을 바꿔 주기 위함. x라는 변수를 매개 변수 int x로 바꿔(설정 = set) 주겠다.
	}
	
	public int getY() {
		return y;
	}
	
	public void sety(int y) {
		this.y = y;
	}
	
	// 생성자란, 객체(instance)를 하나 만들어 줄 때 자동으로 값을 넣어 주는 혹은 값을 초기화해 주는 함수. (값의 초기화 = new , new에 대해서는 16~17강 하단에.)
	public Node(int x, int y) {
		this.x = x;
		this.y = y;		// 앞서 설명했듯 this는 고유 속성 값을 바꿔 주겠다는 거임.
	}
	
	// 여기서 getCenter는, Node other 즉 다른 노드를 매개변수로 받는다. 그리고 다른 노드와 자신이 갖고 있는 x y 좌표를 각각 비교해서 정중앙을 가지는 하나의 좌표를 반환할 수 있도록 하는 것.
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	} // "나누기 2"를 한 이유는, 중앙 좌표를 구하는 게 목적이기 때문.
	
}
// 참고로 여기서 12번째 줄과 20번째 줄의 코드(set)는 굳이 없어도 이번 수업 시간에는 별문제 없다는 댓글 제보.
// set이 하는 일은 x, y 값을 설정하는 것. 때문에, 생성자에서 초기값으로 설정이 가능하다. 이 경우에는 굳이 쓸 필요 없었다ㅡㅡㅡ

// ㅡㅡㅡ그럼에도 set을 왜 썼냐? === 하나의 약속임. get변수와 set변수를 함께 만들어야 한다ㅡ 라는 약속.
// 이클립스는 그 기능 또한 갖고 있다. 코드창 아무대나 우클릭 ~> Source ~> Generate Getters and Setters.