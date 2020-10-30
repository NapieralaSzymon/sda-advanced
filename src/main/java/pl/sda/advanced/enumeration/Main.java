package pl.sda.advanced.enumeration;

public class Main {

    public static void main(String[] args) {
        System.out.println(Sex.MALE == Sex.FEMALE);
        System.out.println(Sex.MALE.equals(Sex.FEMALE));
        for (Sex sex : Sex.values()) {
            System.out.println(sex);
            System.out.println("pretty = " + sex.isPretty());
            System.out.println("strong = " + sex.isStrong());
            switch (sex) {
                case MALE:
                    System.out.println("mężczyzna");
                    break;
                case FEMALE:
                    System.out.println("kobieta");
                    break;
            }
        }
        System.out.println(Sex.MALE == Sex.valueOf("MALE"));
    }

}
