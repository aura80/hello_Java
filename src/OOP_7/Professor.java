package OOP_7;

public class Professor extends Employee{
    String courses;
    int experience;
    int bonus = 0;

    public Professor(String name, String address, String email, int employeeNumber, int salary, String courses, int experience) {
        super(name, address, email, employeeNumber, salary);
        this.courses = courses;
        this.experience = experience;
        System.out.println("Professor ");
    }

    public String getCourses() {
        return this.courses;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int exp) {
        this.experience = exp;
    }

    static String setTitle() {
        return "Professor *** ";
    }

    @Override
    public void info() {
        System.out.print(Professor.setTitle());
        super.info();
        System.out.println(" courses " + this.courses + ", experience: " + this.experience + ", salary " + getSalary());
    }

    public int getBonus() {

        int percent = 0;
        if (getExperience() >= 15 && getExperience() < 20) {
            bonus = super.getSalary()/10;
            percent = 10;
        } else if (getExperience() >= 20) {
            bonus = getSalary()*15/100;
            percent = 15;
        }
        else {
            System.out.println("Professor " + super.getName() + " does not receive bonus!");
            bonus =0;
        }

        System.out.print("Professor " + super.getName() + " receives a " + percent + "% bonus of:   ");

        return bonus;
    }
}
