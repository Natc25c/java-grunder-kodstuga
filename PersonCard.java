public class PersonCard {
   public static void main(String[] args) {
        String firstName = "Amanda";
        String lastName = "Eliasson";
        int age = 34;
        double height = 1.67;
        char grade = 'C';
boolean likesJava = true;

        System.out.println("--- PERSONKORT ---");
        System.out.println("Namn: " + firstName + " " + lastName);
        System.out.println("Ålder: " + age + " år");
        System.out.println("Längd: " + height + " m");
        System.out.println("Betyg i Java: " + grade);
        System.out.println("Gillar Java: " + likesJava);

        int ageNextYear = age + 1;

        System.out.println("Nästa år är " + firstName + " " + ageNextYear + " år.");
    } 
}
