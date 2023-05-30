package SeminarOne;

public class Orange extends Product{
    public Orange(String kind, Double price, Long id) {
        super(kind, price, id);
    }
    @Override
    public String toString() {
        return String.format("У апельсина: %s, %s, %s", getName(),getPrice(),getId());
    }
}
