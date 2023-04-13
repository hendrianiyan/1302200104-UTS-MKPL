package lib;

public class Spouse extends Employee {

    //data Spouse
	private String spouseName;
	private String spouseIdNumber;

    public Spouse (Employee employee, String spouseName, String spouseIdNumber) {
        super ();
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;
    }

    public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
	}
    	
}