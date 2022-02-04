import java.util.Date;

public class Employee extends Person {  
    private String identification;
    private double salary;
    public String occupation;
    public String department;

    public Employee(String name, String lastName1, String lastName2, Date dateBirth, float height, String identification, double salary, String occupation, String department){
        super(name, lastName1, lastName2, dateBirth, height);
        this.identification = identification;
        this.salary = salary;
        this.occupation = occupation;
        this.department = department;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    } 
}