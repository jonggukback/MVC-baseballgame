package baseballgame.ver1;

import java.util.Scanner;

public class BaseBallGameEvent {

	private int Strike = 0;
	private int Ball = 0;
	private int Out = 0;
	private String dap;

	public void setAll() {
		Strike = 0;
		Ball = 0;
		Out = 0;
	}

	public void Check() {
	}

	public void newGame(int size) {
		BaseBallGameRule rule = new BaseBallGameRule(size);

		System.out.println("---------------------");
		System.out.printf("%d자리 게임을 불러왔습니다.\n", size);
		System.out.println("0~9사이 숫자 3자리를 맞추세요");
		System.out.println("기회는 10번 입니다.");
		// 생성된 난수 확인하기
		System.out.println("정답 : " + rule.total(size));
		System.out.println("---------------------");

		int count = 9;

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("정답>");
			dap = scan.nextLine();

			// scan 받은 Stirng 값을 하나씩 떼어서 int 배열에 넣기
			for (int i = 0; i < size; i++) {
				rule.getDapNumber().add(i, Character.getNumericValue(dap.charAt(i)));
			}

			// 힌트검사
			for (int i = 0; i < size; i++) {
				if (rule.getRandomNumber().get(i) == rule.getDapNumber().get(i)) {
					Strike++;
				} else if (rule.getRandomNumber().get(i) != rule.getDapNumber().get(i)) {
					if (rule.getRandomNumber().containsAll(rule.getDapNumber()) == true) {
						Ball++;
					} else {
						Out++;
					}
				}
			}

			if (count == 0) {
				System.out.println("기회가 끝났습니다 실패했습니다.");
				System.out.println("정답은 : " + rule.total(size) + " 입니다");
				setAll();
				break;
			} else if (Strike == 3 || Strike == 4) {
				System.out.println("HR! 정답입니다 게임을 종료합니다.");
				setAll();
				break;
			} else if (Strike > 0 || Ball > 0) {
				System.out.printf("%dS %dB 입니다.\n", Strike, Ball);
				count--;
				System.out.println("남은 기회는 " + count + "번 입니다");
				System.out.println("---------------------");
			} else if (Out == 3) {
				System.out.println("Out 입니다.");
				count--;
				System.out.println("남은 기회는 " + count + "번 입니다");
				System.out.println("---------------------");
			}

			setAll();
		}
	}

}
