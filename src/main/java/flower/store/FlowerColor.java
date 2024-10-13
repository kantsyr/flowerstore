package flower.store;

public enum FlowerColor {
    YELLOW("#FFFF00"), 
    WHITE("#FFFFFF"), 
    ORANGE("#FFA500"), 
    PINK("#FFC0CB"), 
    PURPLE("#800080"),
    RED("#FF0000"), 
    BLUE("#0000FF");
    
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
