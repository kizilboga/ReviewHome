package lesson08;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone p1= new Phone("2434234", "Apple", "qwerty");
		System.out.println(p1.getSerialNumber("qwerty"));
		System.out.println(p1.getSerialNumber("qwyerty"));
		System.out.println("------");
		p1.setSerialNumber("4537jhdjfhg");
		System.out.println(p1.getSerialNumber("qwerty"));
		p1.setSerialNumber("453hfhg");
		System.out.println(p1.getSerialNumber("qwerty"));
		System.out.println(p1.getBrand());
	}

}
