
public class STest {
	
	public void test6() {
		
		System.out.println("if");
		
		for(int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(i > 2) {
					break;
				}
				System.out.println(i + " * " + j + " = " + i * j );
			}
		}
		
		System.out.println();
		
		System.out.println("while");
		
		int A = 2;
		int i = 1;
		while(i <= 9) {
			System.out.println(A + " * " + i + " = " + A * i);
			i = i + 1;
		}
		
	}

	public void test7() {
		
		int sum = 0;
		int[] A = new int[100];
		for(int i = 0; i < A.length; i++) {
			A[i] = i + 1;
			sum += A[i]++;
		}
		System.out.println(sum);
		
	}

	public void test8() {
		
		long multi = 1;
		int[] A = new int[10];
		for(int i = 1; i < A.length; i++) {
			A[i] = i;
			multi *= A[i]++;
		}
		System.out.println(multi);
		
	}

	public void test9() {
		
		int X = 9;
		for(int i = 1; i < 10; i++) {
			System.out.println(X + " * " + i + " = " + X * i);
		}
		
	}

	public void test12() {
		
		int[] arr = new int[20];
		
		System.out.println("A multiple of 2\n");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			
			if(i % 2 == 1) {
				System.out.println(arr[i]);
			}
			
		}
		
		System.out.println();
		System.out.println("A multiple of 3\n");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			
			if(i % 3 == 2) {
				System.out.println(arr[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		

		
	}
}
