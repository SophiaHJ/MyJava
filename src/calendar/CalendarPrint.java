package calendar;

import java.util.Scanner;

public class CalendarPrint {

	public static void main(String[] args) {
		
		System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
		System.out.println("===========================");
		System.out.println("  1  2   3   4   5   6   7");
		System.out.println("  8  9   10  11  12  13  14");
		System.out.println(" 15  16  17  18  19  20  21");
		System.out.println(" 22  23  24  25  26  27  28");
	
		//숫자를 입력받아 해당하는 달의 최대일자 를 출력하는 프로그램     
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please enter a month!");
		int inMonth = sc.nextInt();
		
	
		int [] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.printf(" The Max date of %d is %d.\n", inMonth, maxDays[inMonth -1]);
		
	sc.close();
	}
}
