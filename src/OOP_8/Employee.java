package OOP_8;

public class Employee extends Person{
    int employeeNumber;
    static int salary;

    public Employee(String name, String address, String email, int employeeNumber, int salary) {
        super(name, address, email);
        this.employeeNumber = employeeNumber;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    public int getEmpNumber() {
        return this.employeeNumber;
    }

    public static int getSalary() {
        return salary;
    }

    public void info() {
        System.out.print("name: " + this.name + ", address: " + this.address + ", email: " + this.email + ",");
    }
}
