package flower.store;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    private List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addFlowerBucket(FlowerBucket bucket) {
        flowerBuckets.add(bucket);
    }

    public List<FlowerBucket> search(FlowerType type) {
        return flowerBuckets.stream()
                            .filter(bucket -> bucketHasFlowerType(bucket, type))
                            .collect(Collectors.toList());
    }

    private boolean bucketHasFlowerType(FlowerBucket bucket, FlowerType type) {
        return bucket.getFlowerPacks().stream()
                     .anyMatch(pack -> pack.getFlower().getFlowerType() == type);
    }
}
