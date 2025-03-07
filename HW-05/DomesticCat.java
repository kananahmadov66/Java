public class DomesticCat extends Pet implements Foulable {
    public DomesticCat() {
        super();
        this.species = Species.CAT;
    }

    @Override
    public void respond() {
        System.out.println("The cat purrs.");
    }

    @Override
    public void foul() {
        System.out.println("The cat scratches the furniture.");
    }
}
