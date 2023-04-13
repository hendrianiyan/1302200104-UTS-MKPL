package lib;

import java.util.LinkedList;
import java.util.List;

public class Employee {

	// data Employee
	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;

	private boolean isForeigner;
	private Gender gender; //true = Laki-laki, false = Perempuan

	public enum Gender {
		Laki_Laki,
		Perempuan,
	}

	public List<Child> child;
		
	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, boolean isForeigner, Gender gender) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		this.gender = gender;

		child = new LinkedList<Child>();
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
	public boolean isForeigner() {
		return isForeigner;
	}

	public Gender getGender() {
		return gender;
	}

	public int getSizeChild(){
		return child.size();
	}

    public void addChild(String childName, String childIdNumber) {
		child.add(new Child(childName,childIdNumber));
	}
}
