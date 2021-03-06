/*
		Model : 데이터와 관련된 부분
		
		MVC 패턴 Model 규칙
	
		Model 은 Controller 와 View 에 의존하지 않아야 한다,
		Model 내부에 Controller 와 View 에 관련된 코드가 있으면 안된다.
 */

package baseballgame.ver2;

import java.util.ArrayList;
import java.util.Random;

public class Model {

	// 난수를 설정할 Random a
	Random random = new Random();
	
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
	
	// 생성시 중복 되지않는 난수를 size개수 만큼 randomNumber_array에 담아주는 생성자,
	public Model(int size) { 
		this.size = size;
		for (int i = 0; i < size; i++) { // size -> 변수의 개수를 parameter 값으로 받음
			randomNumber_array.add(i, random.nextInt(9) + 1); // 0~9 사이의 변수
			for (int j = 0; j < i; j++) { // 중복 검사
				if (randomNumber_array.get(i) == randomNumber_array.get(j)) {
					randomNumber_array.remove(i);
					i--;
				}
			}
		}
	}
	public Model() {
		this(3); // 변수의 기본 갯수는 3개
	}
	
	// 힌트 변수값 초기화
	public void hintInit() {
		strike = 0;
		ball = 0;
		out = 0;
	}
	
	// 이 아래는 기본적인 getter, setter method
	public ArrayList<Integer> getRandomNumber_array() {
		return randomNumber_array;
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
		this.ball = this.ball +ball;
	}
	public int getOut() {
		return out;
	}
	public void setOut(int out) {
		this.out = this.out+out;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = this.count + count;
	}
	public int getSize() {
		return size;
	}
}
