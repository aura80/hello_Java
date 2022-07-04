package OOP_8;

abstract class Person  {

//2. Am o clasa Person (name, address, email), clasa Employee(employeeNumber,salary) care mosteneste clasa Person si clasele
//   Profesor (courses, experience) si Secretary(schedule). Stim ca un profesor cu experienta >15 ani are un bonus de 10% din salar
//   iar unul cu experienta mai mare de 20 ani are un bonus de 15% din salar. Stim ca un secretar are 75% din salariul unui profesor.
//
//        Implementeaza solutia si detaliaza continutul:
//
//        Profesorul Ionescu Cristian, avand adresa: str Zorilor, nr 7, Cluj Napoca, email: ionescu@gmail.com avand o experienta de 15 ani,
//        si tinand urmatoarele cursuri: Testare, JS, Java are un salar de 1000 ron.
    String name;
    String address;
    String email;

    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public void setName(String nume) { this.name = nume; }
    public String getName() {
        return this.name;
    }

    public void setAddress(String adresa) { this.address = adresa; }
    public String getAddress() {
        return this.address;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }
    public String getEmail() {
        return this.email;
    }

    public abstract void info();

}
