public class Main {
    public static void main(String[] args) {
        // Create some pet objects
        Pet fish = new Fish();
        Pet dog = new Dog();
        Pet domesticCat = new DomesticCat();
        Pet roboCat = new RoboCat();

        // Create a family with father and mother
        Man father = new Man("John", "Doe", 120);
        Woman mother = new Woman("Jane", "Doe", 110);
        Family family = new Family("Doe", father, mother);

        // Test the pets' responses
        System.out.println("Fish response:");
        fish.respond();
        System.out.println("\nDog response:");
        dog.respond();
        System.out.println("\nDomestic Cat response:");
        domesticCat.respond();
        System.out.println("\nRobo Cat response:");
        roboCat.respond();

        // Testing foul behavior for pets that can foul
        System.out.println("\nTesting foul behavior:");
        if (domesticCat instanceof Foulable) {
            ((Foulable) domesticCat).foul();
        }
        if (dog instanceof Foulable) {
            ((Foulable) dog).foul();
        }

        // Test Human behavior
        System.out.println("\nFather's greeting to pet:");
        father.greetPet();
        father.uniqueMethod(); // Unique method for men (repairCar)

        System.out.println("\nMother's greeting to pet:");
        mother.greetPet();
        mother.uniqueMethod(); // Unique method for women (makeup)

        // Test child creation from family
        Human child = family.bornChild();
        System.out.println("\nNew child born:");
        child.greetPet();
        child.uniqueMethod(); // Unique method for child based on gender
    }
}
