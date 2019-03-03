package designPatterns.creational;

public class Singleton {

    //A. eager loading
//    private static Singleton singleton = new Singleton();
//
//    private Singleton() {}
//
//    public Singleton getInstance() {
//        return singleton;
//    }






    //B. lazy loading
    private static volatile Singleton singleton;

    //stop creation vis Reflections
    private Singleton() {
        if(singleton != null){
            throw new RuntimeException("Instantiation using Reflections !!");
        }
    }

    //Double check locking
    public static Singleton getInstance() {
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    //stop creation while deserialization ??

}
