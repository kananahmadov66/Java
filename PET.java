package happy_family_03;

import java.util.Arrays;
import java.util.Objects;

public class PET {
    private animal_species species;
    private String nickname;
    private int age;
    private int tricklevel;
    private String[] habits;
    PET(animal_species species, String nickname, int age, int tricklevel, String[] habits){
        this.setSpecies(species);
        this.setNickname(nickname);
        this.setAge(age);
        this.setTricklevel(tricklevel);
        this.setHabits(habits);
    }
    PET(animal_species species, String nickname){
        this.setSpecies(species);
        this.setNickname(nickname);
    }
    PET(){
    }
    public animal_species getSpecies(){
        return species;
    }
    public String getNickname(){
        return nickname;
    }
    public int getAge(){
        return age;
    }
    public int getTricklevel(){
        return tricklevel;
    }
    public String[] getHabits(){
        return habits;
    }
    public void setSpecies(animal_species species){
        this.species = species;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setTricklevel(int tricklevel){
        this.tricklevel = tricklevel;
    }
    public void setHabits(String[] habits){
        this.habits = habits;
    }
    void eat() {
        System.out.println("I am eating");
    }
    void respond() {
        System.out.println("Hello owner. I am "+ this.nickname + " i miss you!");
    }
    void foul() {
        System.out.println("I need to cover this up");
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PET pet = (PET) o;
        return getAge() == pet.getAge() && getTricklevel() == pet.getTricklevel() && Objects.equals(getSpecies(), pet.getSpecies()) && Objects.equals(getNickname(), pet.getNickname()) && Objects.deepEquals(getHabits(), pet.getHabits());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpecies(), getNickname(), getAge(), getTricklevel(), Arrays.hashCode(getHabits()));
    }

    @Override
    public String toString() {
        return "PET{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", tricklevel=" + tricklevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("finalize() method is not supported in this class");
        System.out.println("Object is destroyed");
    }
}