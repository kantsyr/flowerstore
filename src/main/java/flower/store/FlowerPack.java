package flower.store;

/**
 * Represents a pack of flowers containing
 *  a specific type of flower and its quantity.
 */
public class FlowerPack {
    /** The flower contained in this pack. */
    private final Flower flower;
    /** The amount of the flowers in this pack. */
    private final int amount;

    /**
     * Constructs a FlowerPack with the specified flower and amount.
     *
     * @param flower the flower contained in the pack, must not be null
     * @param amount the number of flowers in the pack, must be positive
     */
    public FlowerPack(final Flower flowerParam, final int amountParam) {
        this.flower = flowerParam;
        this.amount = amountParam;
    }

    /**
     * Gets the flower contained in this pack.
     *
     * @return the flower in this pack
     */
    public Flower getFlower() {
        return flower;
    }

    /**
     * Gets the amount of flowers in this pack.
     *
     * @return the number of flowers in this pack
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Gets the total price of the flower pack.
     *
     * @return the total price of the flower pack
     */
    public double getPrice() {
        return flower.getPrice() * amount;
    }
}
