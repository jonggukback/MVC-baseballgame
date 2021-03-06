/*	
		Controller : Model과 View  두 사이를 이어주는 부분
		
		MVC 패턴 Controller 규칙
   
		Controller는 Model과 View에 의존해도 된다.
		Controller 내부에는 Model과 View의 코드가 있을 수 있다.
*/

package baseballgame.ver3;

import java.util.Scanner;

public class Cotroller {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		View view = new View();
		Model model_3 = new Model();
		Model model_4 = new Model(4,10);
		
		BaseBallGameVO data3 = model_3.VO();
		BaseBallGameVO data4 = model_4.VO();
		
		System.out.println("1. 3자리 게임");
		System.out.println("2. 4자리 게임");
		System.out.print("선택>");
		int howNumberPlay = scan.nextInt();
		
		switch(howNumberPlay) {
			case 1:
				view.gamePlay(data3); //3 자리게임 목숨 10개
				break;
			case 2:
				view.gamePlay(data4); //4 자리게임 목숨 10개
				break;
		}
		
		scan.close();
	}

}
