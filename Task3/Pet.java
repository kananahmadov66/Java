import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int tricklevel1;
    private String[] habits;

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int tricklevel1, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel1 = tricklevel1;
        this.habits = habits;
    }

    public Pet() {
    }

    // Getter methods for private fields
    public String getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel1() {
        return tricklevel1;
    }

    public String[] getHabits() {
        return habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello owner. I am " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + " tricklevel1=" + tricklevel1 + ", habits=" + Arrays.toString(habits) + "}";
    }
}
