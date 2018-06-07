package calendar;

import java.util.Scanner;

public class CalendarPrint {
	
	public static final int [] MaxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxdaysOfMonth(int inMonth) {
		return MaxDays[inMonth-1];
	}

	public void printSampleCalendar() {
		System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
		System.out.println("===========================");
		System.out.println("  1  2   3   4   5   6   7");
		System.out.println("  8  9   10  11  12  13  14");
		System.out.println(" 15  16  17  18  19  20  21");
		System.out.println(" 22  23  24  25  26  27  28");
	}
	
	public static void main(String[] args) {
		
		//숫자를 입력받아 해당하는 달의 최대일자 를 출력하는 프로그램     
		Scanner sc = new Scanner(System.in); 	
		System.out.println("달을 입력하세요");
		int inMonth = sc.nextInt();
		
		//달의 최대일자 구하는 메소드
		CalendarPrint cal = new CalendarPrint();
		
		System.out.printf("%d월의 마지막날은 %d입니다\n", inMonth, cal.getMaxdaysOfMonth(inMonth));
		
		sc.close();
	}
}
