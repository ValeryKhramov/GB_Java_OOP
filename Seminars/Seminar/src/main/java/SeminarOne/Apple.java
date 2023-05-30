package SeminarOne;

public class Apple extends Product{
    public Apple(String kind, Double price, Long id) {
        super(kind, price, id);
    }

    @Override
    public String toString() {
        return String.format("У яблока: %s, %s, %s", getName(),getPrice(),getId());
    }
}
