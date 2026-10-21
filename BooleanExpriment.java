public class BooleanExpriment {
    public static void main (String [] args) {

        int age = 19;

        boolean test1 = age > 18; 
        boolean test2 = age < 18; 
        boolean test3 = age == 20; 
        boolean test4 = age != 20; 
        
        System.out.println(test1); 
        System.out.println(test2); 
        System.out.println(test3); 
        System.out.println(test4);

        boolean hasTicket = true; 
        boolean isAdult = false;

        boolean allowed = hasTicket || isAdult; 
        System.out.println(allowed);
    }
    
}
