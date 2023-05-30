package SeminarOne;

public class Banana extends Product{
    public Banana(String kind, Double price, Long id) {
        super(kind, price, id);
    }
    @Override
    public String toString() {
        return String.format("У банана: %s, %s, %s", getName(),getPrice(),getId());
    }
}
