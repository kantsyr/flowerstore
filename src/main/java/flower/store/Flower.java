package flower.store;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a flower with its characteristics.
 */
@Setter
public class Flower {
    /** The length of the sepal. */
    @Getter
    private double sepalLength;

    /** The color of the flower. */
    private FlowerColor color;

    /** The price of the flower. */
    @Getter
    private double price;

    /** The type of the flower. */
    @Getter
    private FlowerType flowerType;

    /**
     * Gets the flower color.
     *
     * @return the flower color as a string
     */
    public String getFlowerColor() {
        return color.toString();
    }

    /**
     * Sets the color of the flower.
     *
     * @param flowerColor the color to set for the flower
     */
    public void setFlowerColor(final FlowerColor flowerColor) {
        this.color = flowerColor;
    }

    /**
     * Sets the type of the flower.
     *
     * @param type the type to set for the flower
     */
    public void setFlowerType(final FlowerType type) {
        this.flowerType = type;
    }
}
