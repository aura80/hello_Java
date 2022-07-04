package OOP_8;

public class Secretary extends Employee{

    static int percSecretary = 75;
    boolean schedule;

    public Secretary(String name, String address, String email, int employeeNumber, boolean schedule) {
        super(name, address, email, employeeNumber, salary);
        this.schedule = schedule;
    }

    public int salarySecretary() {
        System.out.print("Secretary's salary is: ");
        return Professor.getSalary() * Secretary.percSecretary / 100;
    }

    static String setTitle() {
        return "Secretary *** ";
    }

    @Override
    public void info() {
        System.out.print(Secretary.setTitle());
        super.info();
        System.out.println(" schedule: " + schedule() + ", salary: " + salarySecretary() + " RON, is 75% of: " + getSalary() + " RON the teacher's salary");
    }

    public String schedule() {
        String sch;
        if (this.schedule) {
            sch = "Busy";
        }else sch = "Not busy";

        return sch;
    }

    public static void main(String[] args) {
        Professor prof1 = new Professor("Georgescu", "str. Avram Iancu, nr 7, Ploiesti", "aaaa@yahoo.com", 44555678, 3000, "Java", 25);

        System.out.println(prof1.getName());
        System.out.println(prof1.getAddress());
        System.out.println(prof1.getEmail());
        System.out.println(prof1.getEmpNumber());
        System.out.println(prof1.getSalary());
        System.out.println(prof1.getBonus() + " RON");
        prof1.info();
        prof1.setName("Gica Popescu");
        System.out.println(prof1.getName());
        prof1.info();
        System.out.println(prof1.getCourses());
        prof1.setExperience(7);
        System.out.println(prof1.getExperience());
        //System.out.println(prof1.getBonus() + " RON");
        prof1.info();
        System.out.println(prof1.getBonus() + " RON");
        prof1.setExperience(19);
        prof1.info();
        System.out.println(prof1.getBonus() + " RON");
        prof1.setExperience(22);
        prof1.info();
        System.out.println(prof1.getBonus() + " RON");

        Secretary secretar1 = new Secretary("Ana Popescu", "str. Andrei Saguna, nr. 5", "anapop@gmail.com", 555894, true);

        System.out.println(secretar1.getName());
        System.out.println(secretar1.getAddress());
        System.out.println(secretar1.getEmail());
        System.out.println(secretar1.getEmpNumber());
        System.out.println(secretar1.salarySecretary() + " RON , representing 75% of the teacher's salary of " + Professor.getSalary() + " RON");
        System.out.println("-----------------------------------------------");

        System.out.println(Professor.setTitle() + " " + prof1.getName() + ", having the address: " + prof1.getAddress() + ", email:" + prof1.getEmail() + ", with an experience of " + prof1.getExperience() + " years " + " and keeping the following courses: " + prof1.getCourses() + " has a net salary of " + Professor.getSalary());
        secretar1.info();

    }


}
