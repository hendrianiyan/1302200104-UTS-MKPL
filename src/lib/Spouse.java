package lib;

public class Spouse extends Employee {

    //data Spouse
	private String spouseName;
	private String spouseIdNumber;
    public Object getSpouseIdNumber;

    public Spouse (Employee employee, String spouseName, String spouseIdNumber) {
        super (
                employee.getEmployeeId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getIdNumber(),
                employee.getAddress(),
                employee.isForeigner(),
                employee.getGender()
                );
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;
    }

    public void setSpouse(String spouseName, String spouseIdNumber, String idNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
	}
    
    public String getSpouseName() {
        return spouseName;
    }

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }
}