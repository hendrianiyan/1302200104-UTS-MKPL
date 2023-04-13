package lib;

import java.time.LocalDate;
import java.time.Month;
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
	private boolean gender; //true = Laki-laki, false = Perempuan

	public enum Gender {
		Laki_Laki,
		Perempuan,
	}

	private Gender gender;
	
	public enum Gender {
		Laki_Laki,
		Perempuan,
	}

	private Gender gender;

	
	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, boolean isForeigner, boolean gender) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		this.gender = gender;
	