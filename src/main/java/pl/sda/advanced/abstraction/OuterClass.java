package pl.sda.advanced.abstraction;

public class OuterClass {

    public class InnerClass {

    }

    public static class StaticInnerClass {

    }

    public static void main(String[] args) {
        // non-static nested class
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        // static nested class
        StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        // anonymous class
        Interface anonymousClass = new Interface() {
            @Override
            public void doSomething() {
                System.out.println("Do something");
            }
        };
        anonymousClass.doSomething();
    }

}
