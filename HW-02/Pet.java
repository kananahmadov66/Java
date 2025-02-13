import java.util.Set;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private Set<String> habits;

    public Pet(String species, String nickname, int age, Set<String> habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.habits = habits;
    }

    @Override
    public String toString() {
        return "Pet{species='" + species + "', nickname='" + nickname + "', age=" + age +
                ", habits=" + habits + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age);
    }
}
