package week03;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	Subway(String lineNumber){
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money += money;
		this.passengerCount++;		
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은 "
				+ passengerCount + "명이고, 수입은 "
				+ money+ " 원 입니다.");
	}
	
}
