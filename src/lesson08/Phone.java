package lesson08;

public class Phone {
	
	private String serialNumber;
	private String brand;
	private String password;
	
	Phone(String serialNumber, String brand, String password){
		this.brand=brand;
		this.password=password;
		this.serialNumber=serialNumber;
	
	}
	
	public void displayInfo() {
		System.out.println(brand + " brand has"+ serialNumber);
	}

	public String getSerialNumber(String password) {
		String result="";
		if (password.equals(this.password)) {
			result=serialNumber;
		}else {
			
			result= "Invalid Access!";
		}
		return result;
	}

	public void setSerialNumber(String serialNumber) {
		if(serialNumber.length()==7) {
			this.serialNumber = serialNumber;
		}
		
	}

	public String getBrand() {
		return brand;
	}
	
	

}
