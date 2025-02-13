import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Human mother = new Human("Alice", "Smith", 1985);
        Human father = new Human("Bob", "Smith", 1982);

        Family family = new Family(mother, father);

        Human child1 = new Human("Charlie", "Smith", 2010);
        Human child2 = new Human("Daisy", "Smith", 2012);

        family.addChild(child1);
        family.addChild(child2);

        Set<String> habits = new HashSet<>(Arrays.asList("Barking", "Running"));
        Pet pet = new Pet("Dog", "Buddy", 3, habits);
        family.setPet(pet);

        System.out.println(family);

        family.deleteChild(child1);
        System.out.println("After removing a child: " + family);

        System.out.println("Family size: " + family.countFamily());
    }
}
