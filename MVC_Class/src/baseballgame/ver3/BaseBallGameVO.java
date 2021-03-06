package baseballgame.ver3;

import java.util.ArrayList;

public class BaseBallGameVO {

		// 난수를 담을 배열 선언
		private ArrayList<Integer> randomNumber_array = new ArrayList<Integer>();

		// 사용자 입력값을 받을 변수 선언
		private String inputData;

		// inputData를 담을 배열 선언, 난수 배열과 인덱스 값 비교 예정
		private ArrayList<Integer> inputData_array = new ArrayList<Integer>();

		// 힌트에 사용되는 변수 선언
		private int strike;
		private int ball;
		private int out;
		
		// 정답 기회에 사용되는 변수 선언
		private int count;

		// 난수의 개수에 사용되는 변수 선언
		private int size;

		// 힌트 변수값 초기화
		public void hintInit() {
			strike = 0;
			ball = 0;
			out = 0;
		}
		
		// getter, setter method
		public ArrayList<Integer> getRandomNumber_array() {
			return randomNumber_array;
		}

		public void setRandomNumber_array(ArrayList<Integer> randomNumber_array) {
			this.randomNumber_array = randomNumber_array;
		}

		public String getInputData() {
			return inputData;
		}

		public void setInputData(String inputData) {
			this.inputData = inputData;
		}

		public ArrayList<Integer> getInputData_array() {
			return inputData_array;
		}

		public void setInputData_array(ArrayList<Integer> inputData_array) {
			this.inputData_array = inputData_array;
		}

		public int getStrike() {
			return strike;
		}

		public void setStrike(int strike) {
			this.strike += strike;
		}

		public int getBall() {
			return ball;
		}

		public void setBall(int ball) {
			this.ball += ball;
		}

		public int getOut() {
			return out;
		}

		public void setOut(int out) {
			this.out += out;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count += count;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}
}
