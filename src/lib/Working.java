package lib;

import java.time.LocalDate;

public class Working extends Employee{

    //data Working
	private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;

    public Working (Employee employee, int yearJoined, int monthJoined, int dayJoined, int monthWorkingInYear){
          
          super();
		  this.yearJoined = yearJoined;
		  this.monthJoined = monthJoined;
		  this.dayJoined = dayJoined;
		  this.monthWorkingInYear = monthWorkingInYear;
    }

    public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == yearJoined) {
			monthWorkingInYear = date.getMonthValue() - monthJoined;
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumbers.size());
	}
}