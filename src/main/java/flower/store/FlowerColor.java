package flower.store;
/**
 * Represents the colors available for flowers.
 */

public enum FlowerColor {
    /** Yellow color representation. */
    YELLOW("#FFFF00"), 
    /** White color representation. */
    WHITE("#FFFFFF"), 
    /** Orange color representation. */
    ORANGE("#FFA500"), 
    /** Pink color representation. */
    PINK("#FFC0CB"), 
    /** Purple color representation. */
    PURPLE("#800080"),
    /** Red color representation. */
    RED("#FF0000"), 
    /** Blue color representation. */
    BLUE("#0000FF");
    
    /** The string representation of the color. */
    private final String stringRepresentation;

    /**
     * Constructs a FlowerColor with the specified string representation.
     *
     * @param stringRepresentation the string representation of the color
     */
    FlowerColor(final String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
