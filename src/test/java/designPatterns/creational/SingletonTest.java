package designPatterns.creational;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton singletonOne = Singleton.getInstance();
        Singleton singletonTwo = Singleton.getInstance();
        System.out.println(singletonOne == singletonTwo);
    }
}
