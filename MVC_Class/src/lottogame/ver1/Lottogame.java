package lottogame.ver1;

import java.util.Random;
import java.util.Scanner;

public class Lottogame {

	public void gameStart() {
		
		// 임의의 숫자를 채번하는 메소드를 제공하는 클래스 임 - 0.0~1.0
		Random random = new Random();
		
		// 게임이 시작되기전에 0부터 9사이의 임의의 수를 채번하기
		// 사용자가 값을 입력하는 것보다 먼저 채번해야 된다.
		int dap = random.nextInt(10); // 0이상 10미만 사이의 정수를 리턴해 준다.
		
		// 사용자가 입력한 (콘솔화면) 값을 읽어올 때 - 듣기
		Scanner scan = new Scanner(System.in);
		
		//안내 메세지 - 유효범위는 0~9 사이
		System.out.println("0부터 9까지의 숫자를 입력하시오.");
		
		// 사용자가 입력한 값을 담을 변수 선언
		String str = null;
		
		// 사용자가 입력한 값이 null이 아니면 계속 반복
		// 몇번인지 정해지지않음 - 이걸 정하고싶을때 for문을 사용
		while( (str = scan.next()) != null) {
			
			// 0~9 사이 숫자만 입력
			if (Integer.parseInt(str) > 9 || Integer.parseInt(str) < 0) {
				System.out.println("0~9 사이의 숫자만 입력 해주세요.");
			}
			else {
				// 입력 값과 랜덤으로 채번한 값 비교하기
				// 같을시 정답을 콘솔창에 띄워주고 while문 종료
				if (Integer.parseInt(str) == dap) {
					System.out.println("정답");
					break;
				}
				// if문 조건에 수렴하지 않으면 아래로 온다.
				else if (Integer.parseInt(str) > dap) { // 정답보다 높을때 힌트를 주고 반복
					System.out.println("정답보다 높습니다, 답을 낮추세요");
				}
				else if (Integer.parseInt(str) < dap) { // 정답보다 낮을때 힌트를 주고 반복
					System.out.println("정답보다 낮습니다, 답을 높이세요");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Lottogame Lg = new Lottogame(); // 인스턴스화로 불러서 실행
		Lg.gameStart();
	}
	
	/*
	 * 		추가로 구현해봐야할 기능
	 * 		목숨(count) 기능
	 * 		전적(history) 기능
	 * 
	 */
}
