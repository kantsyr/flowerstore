package flower.store;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a bucket that holds flower packs.
 */
public class FlowerBucket {final
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    /**
     * Adds a flower pack to the bucket.
     *
     * @param pack the flower pack to add to the bucket
     */
    public void addFlowerPack(final FlowerPack pack) {
        flowerPacks.add(pack);
    }
    /**
     * Gets the total price of all flower packs in the bucket.
     *
     * @return the total price of the flower packs
     */
    public double getPrice() {
        return flowerPacks.stream()
                            .mapToDouble(FlowerPack::getPrice)
                            .sum();
    }

    /**
     * Gets the list of flower packs in the bucket.
     *
     * @return the list of flower packs
     */
    public List<FlowerPack> getFlowerPacks() {
        return flowerPacks;
    }
}
