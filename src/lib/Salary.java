package lib;

public class Salary extends Employee {

    //data Salary
    private int monthlySalary;
    private int otherMonthlyIncome;
    private int annualDeductible;


    public Salary(Employee employee, int monthlySalary, int otherMonthlyIncome, int annualDeductible) {

        super(
                employee.getEmployeeId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getIdNumber(),
                employee.getAddress(),
                employee.isForeigner(),
                employee.getGender()
        );
        this.monthlySalary = otherMonthlyIncome;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.annualDeductible = annualDeductible;
    }

    /**
     * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
     * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
     */

    public void setMonthlySalary(int grade) {
        if (grade == 1) {
            monthlySalary = 3000000;
            CalIsForeigner();
        } else if (grade == 2) {
            monthlySalary = 5000000;
            CalIsForeigner();
        } else if (grade == 3) {
            monthlySalary = 7000000;
            CalIsForeigner();
        }
    }

    public void CalIsForeigner() {
        if (super.isForeigner()) {
            monthlySalary = (int) (monthlySalary + (monthlySalary * 1.5));
        }
    }

    public void setAnnualDeductible(int deductible) {
        this.annualDeductible = deductible;
    }

    public void setAdditionalIncome(int income) {
        this.otherMonthlyIncome = income;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public int getAnnualDeductible() {
        return annualDeductible;
    }
}
