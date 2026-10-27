public class Animals {

    String name;
    int age;
    String sound;

    public Animals(String animalName, int animalAge, String animalSound) {
        name = animalName;
        age = animalAge;
        sound = animalSound;
    }

    public void makeSound() {
        System.out.println(sound);
    }
    
}

