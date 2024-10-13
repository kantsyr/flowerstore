package flower.store;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Represents a flower store that holds flower buckets.
 */
public class Store {
    /** List of flower buckets available in the store. */
    private List<FlowerBucket> flowerBuckets = new ArrayList<>();

    /**
     * Adds a flower bucket to the store.
     *
     * @param bucket the flower bucket to be added; should not be null
     */
    public void addFlowerBucket(final FlowerBucket bucket) {
        flowerBuckets.add(bucket);
    }

    /**
     * Searches for flower buckets that contain flowers of the specified type.
     *
     * @param type the type of flower to search for; should not be null
     * @return a list of flower buckets that contain the specified flower type
     */
    public List<FlowerBucket> search(final FlowerType type) {
        return flowerBuckets.stream()
                            .filter(bucket -> bucketHasFlowerType(bucket, type))
                            .collect(Collectors.toList());
    }

    /**
     * Checks if a flower bucket contains flowers of the specified type.
     *
     * @param bucket the flower bucket to check; should not be null
     * @param type the type of flower to check for; should not be null
     * @return true if the bucket contains flowers of
     * the specified type; false otherwise
     */
    private boolean bucketHasFlowerType(final FlowerBucket bucket,
    final FlowerType type) {
        return bucket.getFlowerPacks().stream()
.anyMatch(pack -> pack.getFlower().getFlowerType() == type);
    }
}
