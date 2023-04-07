import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("주민번호를 입력하세요. EX) 991019-7890123");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine(); //사용자에게 string의 값을 입력받는 함수 nextLine()을 호출해 스트링의 값을 얻는다.
		
	char gender = str.charAt(6); //받은 값중 6번째 index의 char값 하나만 추출해서 char타입의 변수에 담아둔다. 991019-7 다음번째인 8에 해당한다. 0번 인덱스부터 생각해야함.
	System.out.println("당신의 주민등록번호 뒷자리 첫번째는 "+gender+"이며,");
	String genderType = (gender == '1' || gender == '3') ? "남자" : (gender == '2' || gender == '4') ? "여자" : (gender == '5') ? "선택없음" : "외계인" ;
	
	System.out.println("당신은 "+genderType+"입니다");
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
