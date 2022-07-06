package OOP_9;

public class Exceptions {

    public static void main(String[] args) {
        //System.out.println(aria(-1));
        //createAccount(12);
        //createAccount(-12);
        //createAccount(21);

//        System.out.println(stringToInt("4"));
//
//        System.out.println(stringToInt("y"));

//        System.out.println(impartire(12,0));
        System.out.println(impartire(12, stringToInt("a")));
    }

//    public static double aria(double radius) {
//        if (radius < 0) {
//            throw new IllegalArgumentException("Raza trebuiea sa fie > 0");
//        }
//        return 3.14 * radius * radius;
//    }

    // vreau sa creez un cont dar am restrictie la varsta
    // if persoana are varsta < 18 ani -> Acces denied! esti prea mic
    // daca persoana are o varsta negativa -> invalid age value
    // daca varsta e buna -> access granted!

    public static void createAccount(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("invalid age value");
        } else if (age < 18)  {
            throw new IllegalArgumentException("Acces denied! esti prea mic");
        }else
            System.out.println("access granted!");
    }

    // try/catch example
    // string to int
    public static int stringToInt(String a) {
        int rez = 0;
        try {
            rez = Integer.parseInt(a);  // Integer.valueOf
            System.out.println("Stringul initial este "+ a);
        }
        catch (NumberFormatException e) {
            System.out.println("Valoarea trebuie sa fie nr!!");
        }
        finally {
            System.out.println("Stringul initial este "+ a + " !");
        }

        return rez;
    }

    // impartirea a doua numere
    public static int impartire(int a, int b) {
        int rez = 0;

        try {
            b = Integer.parseInt("a");
            rez = a/b;
        }
        catch (ArithmeticException e) { // | NumberFormatException e) {
            System.out.println("Division by 0");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid integer value");
        }

        return rez;
    }

}
