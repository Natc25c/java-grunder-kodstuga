public class Rollercoaster {
    public static void main (String [] args) {

        int age = 13;
        double length = 1.55;

        if (age >= 14 && length >= 1.40 ){

         System.out.println("Du får åka bergochdalbanan!");

        }

        else if (age >= 14 && length < 1.40 ) {
         System.out.println("Du är tyvärr för kort.");

        }

        else {
            System.out.println("Du är för ung för att åka.");

        }
    }


    
}
