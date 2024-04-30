public class Employee extends Person {
    public int hireYear;
    public String companyName;
    public double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireYear, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireYear = hireYear;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority() {
        return 2024 - hireYear;
    }

    public double getSalary() {
        return salary;
    }
}
