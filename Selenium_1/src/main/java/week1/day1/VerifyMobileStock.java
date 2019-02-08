package week1.day1;

public class VerifyMobileStock {

	public static void main(String[] args) {
		
		MobileStock ms=new MobileStock();
		ms.brandstock("oppo");
		String mobilecolor=ms.mobilecolor("redmi");
		System.out.println(mobilecolor);
	}
}
