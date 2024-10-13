package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class FlowerStoreTest {
    private static final double ROSE_SEPAL_LENGTH = 4.0;
    private static final double CHAMOMILE_SEPAL_LENGTH = 3.5;
    private static final double TULIP_SEPAL_LENGTH = 5.0;

    private static final int ROSE_PRICE = 50;
    private static final int CHAMOMILE_PRICE = 30;
    private static final int TULIP_PRICE = 40;

    private static final int ROSE_PACK_AMOUNT = 10;
    private static final int CHAMOMILE_PACK_AMOUNT = 5;
    private static final int TULIP_PACK_AMOUNT = 8;

    private static final int ROSE_PACK_PRICE = 500;
    private static final int CHAMOMILE_PACK_PRICE = 150;
    private static final int TULIP_PACK_PRICE = 320;
    private static final int BUCKET_INITIAL_PRICE = 650;

    private Flower rose;
    private Flower chamomile;
    private Flower tulip;
    private FlowerPack rosePack;
    private FlowerPack chamomilePack;
    private FlowerPack tulipPack;
    private FlowerBucket flowerBucket;
    private Store store;

    @BeforeEach
    public void init() {
        rose = new Rose(ROSE_SEPAL_LENGTH, FlowerColor.RED, ROSE_PRICE);
        chamomile = new Chamomile(CHAMOMILE_SEPAL_LENGTH,
         FlowerColor.WHITE, CHAMOMILE_PRICE);
        tulip = new Tulip(TULIP_SEPAL_LENGTH, FlowerColor.PINK, TULIP_PRICE);


        rosePack = new FlowerPack(rose, ROSE_PACK_AMOUNT);
        chamomilePack = new FlowerPack(chamomile, CHAMOMILE_PACK_AMOUNT);
        tulipPack = new FlowerPack(tulip, TULIP_PACK_AMOUNT);


        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(rosePack);
        flowerBucket.addFlowerPack(chamomilePack);


        store = new Store();
        store.addFlowerBucket(flowerBucket);
    }


    @Test
    public void testFlowerPackPrice() {
        Assertions.assertEquals(ROSE_PACK_PRICE, rosePack.getPrice());
        Assertions.assertEquals(CHAMOMILE_PACK_PRICE, chamomilePack.getPrice());
    }

    @Test
    public void testFlowerBucketPrice() {
        Assertions.assertEquals(BUCKET_INITIAL_PRICE, flowerBucket.getPrice());
    }

    @Test
    public void testAddFlowerPack() {
        flowerBucket.addFlowerPack(tulipPack);
        Assertions.assertEquals(BUCKET_INITIAL_PRICE + TULIP_PACK_PRICE,
         flowerBucket.getPrice());
    }


    @Test
    public void testStoreSearchByFlowerType() {
        List<FlowerBucket> result = store.search(FlowerType.ROSE);
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(flowerBucket, result.get(0));
    }

    @Test
    public void testStoreSearchNonExistentFlowerType() {
        List<FlowerBucket> result = store.search(FlowerType.TULIP);
        Assertions.assertEquals(0, result.size());
    }
}
