package week03;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	Bus(int busNumber){
		this.busNumber = busNumber;
	}

	public void take(int money) {
		this.money += money;
		this.passengerCount++;		
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber 
				+ "번의 승객은 " + passengerCount
				+ " 명이고, 수입은 " + money +"원 입니다.");
	}
	
}
