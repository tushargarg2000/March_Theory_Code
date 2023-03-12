public class Vehicle {

    int tyre;
    String color;
    int seater;
    String brand;
    int powerOfEngine;
    int price;


    double func(String price,int powerOfEngine){

        return 0.0;
    }

    int func(int price,int powerOfEngine){

        return 0;
    }


    //Mac : Command + N
    //Windows : Alt + Insert

    public Vehicle(int tyre,String color)
    {
        this.tyre = tyre;
        this.color = color;
    }

    public Vehicle(int tyre, String color, int seater) {
        this(tyre,color);
        this.seater = seater;
    }


    public Vehicle(int tyre, String color, int seater, String brand, int powerOfEngine, int price) {

        //I can avoid reinitializing the attributes
        // as they are already defined above
        this(tyre,color,seater);

        this.brand = brand;
        this.powerOfEngine = powerOfEngine;
        this.price = price;
    }
}
