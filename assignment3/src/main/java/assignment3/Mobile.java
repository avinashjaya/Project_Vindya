package assignment3;

interface IMobile {
public void Dial();
}
interface ITelephone{
	public void Dial();
	
}

class Mobile implements IMobile,ITelephone{

	long IEMICode;
	boolean IsSingleSim;
	String Processor;
	String SimCard;
	long MobileNumber;

	public void ConnectionBlueTooth() {
		System.out.println("Blutooth is 2.0");

	}

	public void Dial() {
		System.out.println("Enter your number");
	}

	public void GetIEMICode() {
		System.out.println("IEMI Code is :16258942364");
	}

	public void GetWIFIConnection() {
		System.out.println("Wifi Connection is available");

	}

	public void Receive() {
		System.out.println("Message has recived");
	}

	public void SendMessage() {
		System.out.println("Enter Your Messeage");
	}

	
}