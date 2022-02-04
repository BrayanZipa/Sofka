import java.util.Date;

/**
 * Representa a una persona con el rol de empleado, extiende de la clase Person.
 * @author Brayan Zipa
 */
public class Employee extends Person {  
    /**
     * Representa la identificación del empleado.
     */
    private String identification;
    /**
     * Representa el salario del empleado.
     */
    private double salary;
    /**
     * Representa la ocupación del empleado.
     */
    public String occupation;
    /**
     * Representa el departamento de trabajo del empleado.
     */
    public String department;
    
    /**
     * Crea una instancia de la clase Employee, define también los atributos de la clase Person.
     * @param name
     * @param lastName1
     * @param lastName2
     * @param dateBirth
     * @param height
     * @param identification
     * @param salary
     * @param occupation
     * @param department 
     */
    public Employee(String name, String lastName1, String lastName2, Date dateBirth, float height, String identification, double salary, String occupation, String department){
        super(name, lastName1, lastName2, dateBirth, height);
        this.identification = identification;
        this.salary = salary;
        this.occupation = occupation;
        this.department = department;
    }
    /**
     * Devuelve la identificación actual del empleado.
     * @return Identificación actual del empleado. 
     */
    public String getIdentification() {
        return identification;
    }
    
    /**
     * Actualiza la identificación del empleado.
     * @param identification Nuevo número de identificación.
     */
    public void setIdentification(String identification) {
        this.identification = identification;
    }
    
    /**
     * Devuelve el valor del salario actual del empleado.
     * @return Valor del salario actual del empleado.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Actualiza el salario del empleado.
     * @param salary Nuevo salario del empleado.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Devuelve la ocupación actual del empleado.
     * @return Ocupación actual del empleado.
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Actualiza la ocupación del empleado.
     * @param occupation Nueva ocupación del empleado.
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * Devuelve el departamento actual del empleado.
     * @return Departamento actual del empleado.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Actualiza el departamento de trabajo del empleado.
     * @param department Nuevo departamento del empleado.
     */
    public void setDepartment(String department) {
        this.department = department;
    } 
}