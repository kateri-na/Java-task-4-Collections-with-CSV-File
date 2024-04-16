import java.util.Date;

public class Employee {
    private int ID;
    private String name;
    private String sex;
    private Department department;
    private int salary;
    private Date dateOfBirth;

    public Employee(int ID, String name, String sex, Department department, int salary, Date dateOfBirth) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.department = department;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", department=" + department.toString() +
                ", salary=" + salary +
                ", dateOfBirth=" + dateOfBirth.getDate() + "." + (dateOfBirth.getMonth()+1) + "." + (dateOfBirth.getYear()+1900) +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
