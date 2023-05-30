package HomeworkOne;

import SeminarOne.Product;
import SeminarOne.Vending;
import java.util.ArrayList;
import java.util.List;

public class HotDrinkVending implements Vending {
    private final List<HotDrink> list;

    public HotDrinkVending() {
        list = new ArrayList<>();
    }
    @Override
    public void addProduct(Product product){
        list.add((HotDrink) product);
    }

        @Override
        public  Product getProduct(String name){
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

        public HotDrink getProduct(Double volume){
            for (HotDrink product : list) {
                if(volume.equals(product.getVolume())) {
                return product;
                }
            }
            return null;
        }

        public HotDrink getProduct(Integer temp){
            for (HotDrink product : list) {
                if(temp.equals(product.getTemp())) {
                return product;
                }
            }
            return null;
        }
}
