package di;


public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("AppleSpeaker 객체 생성");		
	}

	public void volumeUp() {
		System.out.println("AppleSpeaker의 볼륨을 올린다.");
	}

	public void volumeDown() {
		System.out.println("AppleSpeaker의 볼륨을 내린다.");
	}
	
}

