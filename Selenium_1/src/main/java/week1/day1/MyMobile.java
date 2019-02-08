package week1.day1;

public class MyMobile {

	public static void main(String[] args) {
		
		Mobile mobobj = new Mobile();
		System.out.println(mobobj.age);
		System.out.println(mobobj.haseligible);

		mobobj.message();
		mobobj.playgames();
		mobobj.call();

	}

}
