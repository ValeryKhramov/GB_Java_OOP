package SeminarOne;

import java.util.ArrayList;
import java.util.List;

public class FruitVending implements Vending{
    private final List<Product> list;

    public FruitVending() {
        list = new ArrayList<>();
    }
    @Override
    public void addProduct(Product product){
        list.add(product);
    }

    public Product getProduct(String name){
        for (Product product : list) {
            if (name.equals(product.getName())){
                return product;
            }

        }
        return null;
    }

    public Product getProduct(Long id){
        for (Product product : list) {
            if(id.equals(product.getId())){
                return product;
            }
        }
        return null;
    }

}
