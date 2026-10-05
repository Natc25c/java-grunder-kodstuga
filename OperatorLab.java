public class OperatorLab {
     public static void main(String[] args) {
        int a = 10;
        int b = 3;
        
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        int number = 17;

        System.out.println(number % 2);

        int age = 20;

        boolean test1 = age > 18;
        boolean test2 = age < 18;
        boolean test3 = age == 20;
        boolean test4 = age != 20;

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);

         // Logiska operatorer med OCH (&&)
        boolean hasTicket = true;
        boolean isAdult = false;

        boolean allowed = hasTicket && isAdult;
        System.out.println("Får gå in (&&): " + allowed);

        // --- TEST MED ELLER (||) ---
        // Skriv gärna till detta för att testa uppgiftens sista del:
        boolean hasVIPPass = false;
        boolean allowedWithOR = hasTicket || hasVIPPass;
        System.out.println("Får gå in (||): " + allowedWithOR);


     }

}
