class Employee {
    private long emp_id;
    private String name;

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEmp_id() {
        return this.emp_id;
    }

    public String getName() {
        return this.name;
    }

}

public class encapsulation {
    public static void main(String args[]) {
        Employee employee = new Employee();
        employee.setEmp_id(7);
        employee.setName("Rameshwar");
        System.out.println("Employee id is" + employee.getEmp_id() + " and Emloyee name is " + employee.getName());

        Employee employee1 = new Employee();
        employee1.setEmp_id(7);
        employee1.setName("Shiwani");
        System.out.println("Employee id is" + employee1.getEmp_id() + " and Emloyee name is " + employee1.getName());
    }
}
