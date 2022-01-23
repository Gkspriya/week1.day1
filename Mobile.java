package week1.day1;

public class Mobile {
	static String sms1;
	static int num;
	public static void main(String[] args) {
		Mobile mb_Obj=new Mobile();
	    sms1=mb_Obj.sendMsg();
	    num=mb_Obj.makeCall();
	    System.out.println("Message Send:"+sms1);
	    System.out.println("Call From:"+num);
	   mb_Obj.saveContact(num,"Shanmugapriya");
	   
	
	}
	public String sendMsg() {
		String sms="Hi How Are You";
		return sms;
		
	}
	public int makeCall() {
		int ph_Number=1234567890;
		return ph_Number;
	}
	public void saveContact(int call_Num,String name) {
		System.out.println("Contact saved: "+name +call_Num);
	}

}
