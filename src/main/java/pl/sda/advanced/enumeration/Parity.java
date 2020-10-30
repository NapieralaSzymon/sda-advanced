package pl.sda.advanced.enumeration;

public enum Parity implements Calculable {

    EVEN(false), ODD(true);

    private final boolean rest;

    Parity(boolean rest) {
        this.rest = rest;
    }

    public boolean match(int value) {
        return rest == (value % 2 > 0);
    }

    @Override
    public String toString() {
        return super.toString().substring(0, 1);
    }

    @Override
    public boolean isCalculable() {
        return true;
    }

}
