import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a;
		a = input.nextInt();
		
		if(a%2 == 0) {
			System.out.println("입력된 정수는 짝수입니다.\n");
			System.out.println("프로그램이 종료됩니다.");
		}
		else {
			System.out.println("입력된 정수는 홀수입니다.\n");
			System.out.println("프로그램이 종료됩니다.");
		}

	}

}
