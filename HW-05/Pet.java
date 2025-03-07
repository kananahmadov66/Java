public abstract class Pet {
    protected Species species;

    public Pet() {
        this.species = Species.UNKNOWN;  // Default to UNKNOWN
    }

    public abstract void respond();

    public void eat() {
        System.out.println("This pet is eating.");
    }
}
