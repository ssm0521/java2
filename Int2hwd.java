import java.util.Scanner;

public class Int2hwd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요(1,2) : ");
		int number = input.nextInt();
		switch(number){
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		default:
			System.out.println("없음");
			break;
		}
	}

}
