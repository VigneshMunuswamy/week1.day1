package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Make a call to friend");
	}
	
	public void sendMsg() {
		System.out.println("Send Msg to a friend");
		 
	}
	public static void main(String args[]) {
		System.out.println("Mobile");
		Mobile mymob = new Mobile();
		mymob.makeCall();
		mymob.sendMsg();
	}
	}

