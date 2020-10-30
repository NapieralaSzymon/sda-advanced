package pl.sda.advanced.abstraction;

public class Car extends Vehicle {

    public static class Wheel {

        private final String size;

        public Wheel(String size) {
            this.size = size;
        }

        public String getSize() {
            return size;
        }

    }

    public class Exhaust {

        private String fuelOut = "###" + Car.this.fuel + "###";

        public String getFuelOut() {
            return fuelOut;
        }

    }

    private interface Catalyst {

        String filter(Exhaust exhaust);

    }

    private String fuel;

    public void refuel(String fuel) {
        this.fuel = fuel;
    }

    public String filterExhaust(Exhaust exhaust) {
        Catalyst catalyst = new Catalyst() {
            @Override
            public String filter(Exhaust exhaust) {
                return exhaust.getFuelOut().replaceAll("#", "_");
            }
        };
        return catalyst.filter(exhaust);
    }

    @Override
    public void go() {
        System.out.println("Drive");
    }

}
