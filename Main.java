package happy_family_03;
public class Main {
    public static void main(String[] args) {
        PET pet1 = new PET(animal_species.BUNNY, "Bob");
        Human Ethan = new Human("Ethan", "Reynolds", 1992);
        Human Sophie = new Human("Sophie", "Reynolds", 1996);
        Family Reynolds = new Family(Sophie,Ethan);
        Human child1 = new Human("Peter", "Reynolds", 2019,99, pet1, Sophie, Ethan,new String[][]{
                {DAYSOFTHEWEEK.TUESDAY.name(), "School"},
                {DAYSOFTHEWEEK.THURSDAY.name(), "Kindergarden"},
                {DAYSOFTHEWEEK.SATURDAY.name(), "Leisure Walk"}});
        System.out.println(child1);
        System.out.println("--------------");
        Reynolds.addChild(child1);
        Reynolds.countFamily();
        System.out.println(Reynolds);
        System.out.println(Reynolds.countFamily());
        System.out.println("-----------------------");
        Reynolds.delChild(0);
        System.out.println(Reynolds);
        System.out.println(Reynolds.countFamily());
        //From line 17 till 24 I have created a new child and deleted it with index
        //also deleted it before using the variable (child1) before and in both cases it worked just fine
        Human Alex = new Human("Alex", "White", 2006, new String[][]{
                {DAYSOFTHEWEEK.MONDAY.name(), "Playing tennis"},
                {DAYSOFTHEWEEK.WEDNESDAY.name(), "Swimming"},
                {DAYSOFTHEWEEK.FRIDAY.name(), "Football"}});

    }
}
