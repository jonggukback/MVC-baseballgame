/*	
		View : 사용자한테 보여지는 부분
		
		MVC 패턴 View 규칙
   
		View 는 Model 만 의존해야 하고, Controller 에 의존하면 안 된다.
		View 내부에 Model 의 코드만 있을 수 있고, Controller 의 코드가 있으면 안된다.
		View가 Model에게 데이터를 받을 때, 반드시 Controller에서 받아야 한다
		View가 Model에게 데이터를 받을 때, 사용자마다 다르게 보여주어야 하는 데이터만 받아야 한다. 
*/

package baseballgame.ver3;

import java.util.Scanner;

public class View {

	// 콘솔창에 입력받을 스캐너
	Scanner scan = new Scanner(System.in);

	public void gamePlay(BaseBallGameVO model) {
		// test용 정답,목숨 공개
		System.out.println("정답 : " + model.getRandomNumber_array());

		// 맞추거나 실패할때까지 목숨만큼 반복
		while (true) {

			System.out.print("정답>");
			model.setInputData(scan.nextLine());

			// 콘솔창에 입력한 inputData를 한글자씩 떼어서 inputData_array 각 인덱스에 추가
			for (int i = 0; i < model.getSize(); i++) {
				model.getInputData_array().add(i, Character.getNumericValue(model.getInputData().charAt(i)));
			}
			
			// 힌트 검사
			for (int i = 0; i < model.getSize(); i++) {
				if (model.getRandomNumber_array().get(i) == model.getInputData_array().get(i)) {
						model.setStrike(1);
				} 
				else if (model.getRandomNumber_array().get(i) != model.getInputData_array().get(i)) {
					if (model.getRandomNumber_array().containsAll(model.getInputData_array()) == true) {
							model.setBall(1);
					} 
					else {
							model.setOut(1);
					}
				}
			}
			
			if (model.getCount() == 0) {
				System.out.println("기회가 끝났습니다 실패했습니다.");
				System.out.println("정답은 : " + model.getRandomNumber_array() + " 입니다");
				model.hintInit();
				break;
			} else if (model.getStrike() == 3 || model.getStrike() == 4) {
				System.out.println("HR! 정답입니다 게임을 종료합니다.");
				model.hintInit();
				break;
			} else if (model.getStrike() > 0 || model.getBall() > 0) {
				System.out.printf("%dS %dB 입니다.\n", model.getStrike(), model.getBall());
				model.setCount(-1);
				System.out.println("남은 기회는 " + model.getCount() + "번 입니다");
				System.out.println("---------------------");
			} else if (model.getOut() == 3) {
				System.out.println("Out 입니다.");
				model.setCount(-1);
				System.out.println("남은 기회는 " + model.getCount() + "번 입니다");
				System.out.println("---------------------");
			}
			
			model.hintInit();
		}
		
	}
}
