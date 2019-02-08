package week1.day1;

public class MobileStock {

	public void brandstock(String brand)
	{
		switch(brand)
		{
		case "nokia" : System.out.println("Stock count is 10");break;
		case "samsung" : System.out.println("Stock count is 20");break;
		case "oppo" : System.out.println("Stock count is 25");break;
		case "lg" : System.out.println("Stock count is 35");break;
		case "redmi" : System.out.println("Stock count is 35");break;
		default:System.out.println("Stock is not available");
		}
	}	
	
	public String mobilecolor(String mobilemodel)
	{
		if(mobilemodel.equals("redmi"))
		{
			return "blue";
		}
		else if(mobilemodel.equals("oppo"))
		{
			System.out.println("red");
			return "red";
		}
		else return "color is not available";		
	}
}
