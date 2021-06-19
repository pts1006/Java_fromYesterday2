/*
	객체 지향 기법의 활용
	
		지금까지 배운 것들로 자바 객체 지향 기법을 거의 다 배웠다고 할 수 있다.
		이 시간은 그것들을 활용해 다양한 애플리케이션을 개발할 수 있음을 보는 시간.

	목표 : 자바에서 객체 지향을 적절히 활용하는 방법을 이해.
	
	1. 게임 캐릭터 공격 프로젝트를 구현.

*/
public class Main {

	public static void main(String[] args) {
		
		Hero[] heros = new Hero[3];
		heros[0] = new Warrior("전사");
		heros[1] = new Archer("궁수");
		heros[2] = new Wizard("마법사");
		
		for(int i = 0; i < heros.length; i++) {
			heros[i].attack();
			
			
			if(heros[i] instanceof Warrior) { // i번째 인덱스에 해당하는 게임 캐릭터가 워리어의 인스턴스를 가지고 있느냐? 라는 의미.
				Warrior temp = (Warrior) heros[i]; // 히어로 즉, 캐릭터를 전사 인스턴스로 형변환.
				temp.groundCutting();
			}
			else if(heros[i] instanceof Archer)
			{
				Archer temp = (Archer) heros[i];
				temp.fireArrow();
			}
			else if(heros[i] instanceof Wizard)
			{
				Wizard temp = (Wizard) heros[i];
				temp.freezing();
			}
		}
			

	}

}
