// public class Archer ��� ���� �־ �� �ڿ��� extends Object�� ������ �ִ� ����.
public class Archer {

	String name;
	String power;
	
	public Archer(String name, String power) {
		this.name = name;
		this.power = power;
	}
	
	
	// �Ű� ������ ���� obj��� ������ Archer��� �ν��Ͻ��� ������ ���� �ڵ�.
	public boolean equals(Object obj) {
		Archer temp = (Archer) obj;
		// temp�� �ӽ� ���� ���� ��, Ư���� �ǹ̴� ����. ���� "(Archer) obj"�� ���� ���� obj�� Archer ���·� �ٲٰڴٴ� ��.
			
			/* ���⼭ ���.
			 obj��� ������ Archer ���·� �ٲ� �� �ִ� ������ obj�� Archer Ŭ������ �θ� Ŭ�����̱� ����. (������)
			*/
		
		// �츮�� ������ �ִ� name�� power��� ������, temp�� ������ name�� power��� ������ ������ �����.
		if(name == temp.name && power == temp.power) {
			return true;		// ������ Ʈ�� ����.
		}
		else
		{
			return false;		// �ٸ��� ���� ����.
		}
	} // �ڱ� �ڽ��� �ν��Ͻ���, �Ű� ������ ���� ������Ʈ�� ���ؼ� �� ������ ������ �˾� ���� ���.
}
