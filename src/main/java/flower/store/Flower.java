package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getFlowerColor() {
        return color.toString();
    }

    public void setFlowerColor(FlowerColor color) {
        this.color = color;
    }

    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
}
}
