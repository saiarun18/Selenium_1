package week1.day1;

class carbrandname
{
	public String carmodel(String brandname)
	{
		switch(brandname)
		{
		case "Honda":System.out.println("The latest models are -- City,Amaze,accord");break;
		case "Hyundai":System.out.println("The latest models are -- i10,i20,Elantra,Eon");break;
		case "Suzuki":System.out.println("The latest models are -- Ertiga,Celerio,Alto,Wagon R");break;
		case "Ford":System.out.println("The latest models are -- Figo,Aspire,Endeavour");break;
		default:System.out.println("The model is not available");
		}
		return brandname;
	}
}

public class Carmodels {
	
	public static void main(String[] args) {
		System.out.println("Please enter the brandname");
		String latestmodels=new carbrandname().carmodel("Hyundai");
		//System.out.println(latestmodels);
	}	
	
}
