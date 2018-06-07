package gugudan;

import java.util.Scanner;

//두개의 문자 값에 따라 크기가 다른 구구단 출력한다 
public class GugudanMain {
	

	public static void main(String[] args) {	
		
		//","으로 구분된 두개의 입력 문자열을 하나씩 분리
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();
		String[] splictedValue = inputValue.split(",");
		
		//문자를 정수로 변환
		int inputDan = Integer.parseInt(splictedValue[0]);
		int inputMax = Integer.parseInt(splictedValue[1]);

		// 구구단 계산 method와 구구단 출력 method 호출
		System.out.println(inputDan +" * " + inputMax + " 단");
		int guguAray[] = GugudanMethod3.gugudan(inputDan, inputMax);
		GugudanMethod3.guguPrint(inputDan,guguAray);
		System.out.println();
	}	

}
