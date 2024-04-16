public class Department {
    private int ID;
    private String departmentName;

    public Department(int ID, String departmentName) {
        this.ID = ID;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "ID=" + ID +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
