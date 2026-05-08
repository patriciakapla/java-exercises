package ads02;

public class Car {
    String name;
    String model;
    float speed;
    // final: means that the attribute is constant, cant be changed
    static final double pi = 3.1415;

    // static makes method not attached to any instance of the class, it will be
    // executed
    static float mileToMeter(float miles) {
        return miles * 1600;
    }
}