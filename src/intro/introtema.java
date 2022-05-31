package intro;

import java.util.Locale;
import java.util.Random;

public class introtema {

    public static void main(String[] args) {

        // 1.Calculate the sum of the first 50 numbers, higher than 11.
        /*
        for (int i=12;i<=62;i++){
            sum=sum+i;
        }
        System.out.println(sum);
         */

        // 2. Calculate the cube of the first 10 numbers.
        //"For number 2 the cube is 18"
        /*
        for (int i=0;i<=10;i++){
            System.out.println("For number " +i+ "the cube is: " +i*i*i);
        }
        */

        // 3. "Test automation is wonderful" compute the vowels and the consonants
        /*
        int c = 0;
        int v = 0;
        String text = "Ploua ! afara";
        text = text.toLowerCase();  // fara linia asta nu va numara literele mari => 6, 4 in loc de 6, 3
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v++;
            }
            else if (ch>='a' && ch<='z'){
                c++;
            }
        }
        System.out.println("vocale:"+v+" consoane:"+c);

         */

        // 4. I take in consideration the numbers from 1 to 20. For odd numbers, compute their sum,
        // for even numbers, compute their product.
        /*
        int suma = 0;
        double product = 1;
        for (int i = 1;i<=20;i++){
            if (i%2==0){
                product = product * i;
            }
            else {
                suma = suma + i;
            }
        }
        System.out.println("Produsul: "+product+" Suma: "+suma);

         */

        // 5. I have a coin and I throw it 100 times. Compute how many times I get head and how many times I get tails.
        /*
        Random random = new Random();
        int head = 0;
        int tail = 0;
        int r = 0;
        for (int i=1;i<=100;i++){
            r = random.nextInt(2);
            if (r==0){
                head++;
            }
            else {
                tail++;
            }
        }
        System.out.println("tail: " + tail + " head: " + head);

         */

        // 6.


        // 7. Tabla inmultirii
        /*
        for(int i = 1; i<=10; i++){
            for (int j = 0; j<= 9; j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println(" ");

        */

        // 8. switch
        /*
        String letter = "a";
        switch (letter){
        case "a":
            System.out.println("litera mea e a");
            break;
        case "b":
            System.out.println("litera mea e b");
            break;
        case "c":
            System.out.println("litera mea e c");
            break;
        default:
            System.out.println("Nu am invatat inca aceasta litera");
        }

         */

        // 9. switch
        /*
        //int coin = 1;
        String coin = "capp";
        switch (coin){
            // case 1:
            case "cap":
                System.out.println("a iesit cap");
                break;
            // case 2:
            case "pajura":
                System.out.println("a iesit pajura");
                break;
            default:
                System.out.println("aruncare invalida");
        }

         */

        // 10. la jocurile cu noroc exista 4 tipuri de lozuri: abc - castigi o vacanta,
        // 4343 - castigi un joc, 4121 - castigi un suc. orice altceva va da mesajul: nu ai castigat! mai incearca odata !

        String coin = "abc";
        switch (coin){
            case "abc":
                System.out.println("castigi o vacanta");
                break;
            case "4343":
                System.out.println("castigi un joc");
                break;
            case "4121":
                System.out.println("castigi un suc");
                break;
            default:
                System.out.println("nu ai castigat! mai incearca odata !");
        }

    }
}

























