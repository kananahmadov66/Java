public class Main {
    public static void main(String[] args) {
        // Creating pets
        Pet cat = new Pet("cat", "Tyson", 1, 30, new String[]{"eat", "play", "sleep"});
        Pet dog = new Pet("dog", "Rock", 5, 85, new String[]{"sleep", "attack"});

        // Creating parents
        Human mother = new Human("Jane", "Karleone", 1977);
        Human father = new Human("Vito", "Karleone", 1975);

        // Creating child 1
        Human child = new Human("Michael", "Karleone", 1998, 90, dog, mother, father, new String[][]{
                {"Monday", "Reading"},
                {"Tuesday", "Swimming"},
                {"Wednesday", "Drawing"}
        });

        // Creating second family
        Human mother2 = new Human("Sophia", "Smith", 1980);
        Human child2 = new Human("Tom", "Smith", 2005, 85, cat, mother2, null, new String[][]{
                {"Monday", "Football"},
                {"Tuesday", "Painting"}
        });

        // Displaying information for Family 1
        System.out.println("FAMILY 1:");
        System.out.println(father);
        child.greetPet();
        child.describePet();
        dog.eat();
        dog.respond();
        dog.foul();

        // Displaying information for Family 2
        System.out.println("\nFAMILY 2:");
        child2.greetPet();
        child2.describePet();
        cat.eat();
        cat.respond();
        cat.foul();
    }
}
