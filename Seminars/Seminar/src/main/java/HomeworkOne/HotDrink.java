package HomeworkOne;

import SeminarOne.Product;

public class HotDrink extends Product {
    private Integer temp;
    private Double volume;

    public HotDrink(String name, Double price, Long id, Double volume, Integer temp) {
        super(name ,price, id);
        this.temp = temp;
        this.volume = volume;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Горячий напиток - %s, имеет объем - %.1f и температуру %d", getName(), getVolume(), getTemp());
    }
}

