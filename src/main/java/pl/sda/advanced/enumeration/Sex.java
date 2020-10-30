package pl.sda.advanced.enumeration;

public enum Sex implements Readable {

    MALE(false, true), FEMALE(true, false);

    private final boolean pretty;
    private final boolean strong;

    Sex(boolean pretty, boolean strong) {
        this.pretty = pretty;
        this.strong = strong;
    }

    public boolean isPretty() {
        return pretty;
    }

    public boolean isStrong() {
        return strong;
    }

    @Override
    public String toString() {
        switch (this) {
            case MALE:
                return "M";
            case FEMALE:
                return "K";
            default:
                return "?";
        }
    }

    @Override
    public String getReadableValue() {
        return toString();
    }

}
