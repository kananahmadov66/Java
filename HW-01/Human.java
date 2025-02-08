public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this(name, surname, year);
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this(name, surname, year, mother, father);
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }

    public Human() {
    }

    public void greetPet() {
        System.out.println("Hello " + pet.getNickname());
    }

    public void describePet() {
        if (pet.getTrickLevel1() > 50) {
            System.out.println("I have a " + pet.getSpecies() + " that is " + pet.getAge() + " years old, he is very sly");
        } else {
            System.out.println("I have a " + pet.getSpecies() + " that is " + pet.getAge() + " years old, he is almost not sly");
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq +
                ", mother=" + (mother != null ? mother.name + " " + mother.surname : "none") +
                ", father=" + (father != null ? father.name + " " + father.surname : "none") +
                ", pet=" + pet + "}";
    }
}
