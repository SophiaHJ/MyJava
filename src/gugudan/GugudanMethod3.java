package gugudan;

// return 값 존재 method 정의, 파라미터 이용, 배열사용

public class GugudanMethod3 {
		
    // 몇단인지 입력 받아서 해당 구구단을 배열 guguAray에 저장 후 main으로 return
	public static int[] gugudan(int times, int max) {
		int[] guguAray = new int[max];
		for (int j = 0; j < guguAray.length; j++) {
			guguAray[j] = times * (j+1);
		}		
		return guguAray;
	}
	
	// 몇단인지, 그에 해당하는 구구단배열값을 입력받아 해당 1개 단을 출력
	public static void guguPrint(int times, int guguAray[]) {
		for (int k = 0; k < guguAray.length; k++ ) {
			System.out.println(times + " * " + (k+1) +" = " + guguAray[k]);	
		}
	}
}
