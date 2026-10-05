public class StringWorkshop {
    public static void main(String[] args) {
        String firstName = "Anna";
        String lastName = "Andersson";
        String city = "Göteborg";
        String profession = "Mjukvarutestare";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.length());

        // Räkna ut längden och spara i en variabel
        int nameLength = fullName.length();

        System.out.println("Hej! Jag heter " + fullName + ".");
        System.out.println("Mitt namn innehåller " + nameLength + " tecken.");

        System.out.println(fullName + " bor i " + city + " och utbildar sig till " + profession + ".");

    }
}
