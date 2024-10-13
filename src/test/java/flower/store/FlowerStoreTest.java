package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;
/**
 * Tests for the FlowerStore class.
 */
public class FlowerStoreTest {
    /** The sepal length for the rose. */
    private static final double ROSE_SEPAL_LENGTH = 4.0;
    /** The sepal length for the chamomile. */
    private static final double CHAMOMILE_SEPAL_LENGTH = 3.5;
    /** The sepal length for the tulip. */
    private static final double TULIP_SEPAL_LENGTH = 5.0;

    /** The price for the rose. */
    private static final int ROSE_PRICE = 50;
    /** The price for the chamomile. */
    private static final int CHAMOMILE_PRICE = 30;
    /** The price for the tulip. */
    private static final int TULIP_PRICE = 40;

    /** The amount of roses in the pack. */
    private static final int ROSE_PACK_AMOUNT = 10;
    /** The amount of chamomiles in the pack. */
    private static final int CHAMOMILE_PACK_AMOUNT = 5;
    /** The amount of tulips in the pack. */
    private static final int TULIP_PACK_AMOUNT = 8;

    /** The price for the rose pack. */
    private static final int ROSE_PACK_PRICE = 500;
    /** The price for the chamomile pack. */
    private static final int CHAMOMILE_PACK_PRICE = 150;
    /** The price for the tulip pack. */
    private static final int TULIP_PACK_PRICE = 320;
    /** The initial price for the flower bucket. */
    private static final int BUCKET_INITIAL_PRICE = 650;

    /** The flower instance for a rose. */
    private Flower rose;
    /** The flower instance for a chamomile. */
    private Flower chamomile;
    /** The flower instance for a tulip. */
    private Flower tulip;
    /** The flower pack containing roses. */
    private FlowerPack rosePack;
    /** The flower pack containing chamomiles. */
    private FlowerPack chamomilePack;
    /** The flower pack containing tulips. */
    private FlowerPack tulipPack;
    /** The flower bucket that holds flower packs. */
    private FlowerBucket flowerBucket;
    /** The store that holds flower buckets. */
    private Store store;

    /**
     * Initializes the test environment before each test.
     */
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


    /**
     * Tests the price of the flower packs.
     */
    @Test
    public void testFlowerPackPrice() {
        Assertions.assertEquals(ROSE_PACK_PRICE, rosePack.getPrice());
        Assertions.assertEquals(CHAMOMILE_PACK_PRICE, chamomilePack.getPrice());
    }

    /**
     * Tests the price of the flower bucket.
     */
    @Test
    public void testFlowerBucketPrice() {
        Assertions.assertEquals(BUCKET_INITIAL_PRICE, flowerBucket.getPrice());
    }

    /**
     * Tests adding a flower pack to the flower bucket.
     */
    @Test
    public void testAddFlowerPack() {
        flowerBucket.addFlowerPack(tulipPack);
        Assertions.assertEquals(BUCKET_INITIAL_PRICE + TULIP_PACK_PRICE,
         flowerBucket.getPrice());
    }

    /**
     * Tests searching the store by flower type.
     */
    @Test
    public void testStoreSearchByFlowerType() {
        List<FlowerBucket> result = store.search(FlowerType.ROSE);
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(flowerBucket, result.get(0));
    }

    /**
     * Tests searching the store for a non-existent flower type.
     */
    @Test
    public void testStoreSearchNonExistentFlowerType() {
        List<FlowerBucket> result = store.search(FlowerType.TULIP);
        Assertions.assertEquals(0, result.size());
    }
}
