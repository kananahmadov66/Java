public class Main {
    public static void main(String[] args) {
        Pet fish = new Fish();
        Pet dog = new Dog();
        Pet domesticCat = new DomesticCat();
        Pet roboCat = new RoboCat();

        Man father = new Man("John", "Doe", 120);
        Woman mother = new Woman("Jane", "Doe", 110);
        Family family = new Family("Doe", father, mother);

        System.out.println("Fish response:");
        fish.respond();
        System.out.println("\nDog response:");
        dog.respond();
        System.out.println("\nDomestic Cat response:");
        domesticCat.respond();
        System.out.println("\nRobo Cat response:");
        roboCat.respond();

        System.out.println("\nTesting foul behavior:");
        if (domesticCat instanceof Foulable) {
            ((Foulable) domesticCat).foul();
        }
        if (dog instanceof Foulable) {
            ((Foulable) dog).foul();
        }

        System.out.println("\nFather's greeting to pet:");
        father.greetPet();
        father.uniqueMethod();

        System.out.println("\nMother's greeting to pet:");
        mother.greetPet();
        mother.uniqueMethod();

        Human child = family.bornChild();
        System.out.println("\nNew child born:");
        child.greetPet();
        child.uniqueMethod();
    }
}
