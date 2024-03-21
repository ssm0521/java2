import java.util.Scanner;

public class hwd2Int {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("한글을 입력하세요 : ");
		String hwdnumber = input.next();
		switch(hwdnumber){
		case "하나","일","첫째":
			System.out.println(1);
			break;
		case "둘","이","둘째":
			System.out.println(2);
			break;
		default:
			System.out.println("없음");
			break;
		}
	}

}
