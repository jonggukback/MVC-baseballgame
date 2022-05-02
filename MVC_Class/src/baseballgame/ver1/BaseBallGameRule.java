package baseballgame.ver1;

import java.util.ArrayList;
import java.util.Random;

public class BaseBallGameRule {

	Random random = new Random();
	private ArrayList<Integer> randomNumber = new ArrayList<Integer>();
	private ArrayList<Integer> dapNumber = new ArrayList<Integer>();
	int size;
	
	public BaseBallGameRule() {
		this(3);
	}
	
	public BaseBallGameRule(int size) {
		this.size = size;
		for (int i = 0; i < size; i++) {
			randomNumber.add(i, random.nextInt(9) + 1);
			for (int j = 0; j < i; j++) {
				if (randomNumber.get(i) == randomNumber.get(j)) {
					i--;
				}
			}
		}
	}
	
	
	public String total(int size) {
		String number = "";
		for (int i=0; i<size; i++) {
			number += Integer.toString(randomNumber.get(i));
		}
		return number;
	}
	
	public ArrayList<Integer> getRandomNumber() {
		return randomNumber;
	}

	public ArrayList<Integer> getDapNumber() {
		return dapNumber;
	}


}
