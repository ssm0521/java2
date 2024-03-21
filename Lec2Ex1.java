import java.util.Scanner;
public class Lec2Ex1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("2개의 정수를 입력하세요 : ");
		int num1;
		int num2;
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println(+num1+"더 큰 정수입니다.");
		}
		else if(num1 < num2) {
			System.out.println(+num2+"더 큰 정수 입니다.");
		}
		else {
			System.out.println("두 정수의 크기는 같습니다.");
		}
	}
}
