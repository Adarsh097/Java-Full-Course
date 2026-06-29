public class Demo2 {
    public static void main(String[] args){
        Car car = new Car();
        car.brand = "Toyota";
        car.color = "Red";
        car.speed = 0;

        car.start();
        car.accelerate();
        car.displayInfo();
    }
}


class Car{
    String brand;
    String color;
    int speed;


    void start(){
        System.out.println("Car is starting...");
    }

    void accelerate(){
        speed += 10;
        System.out.println("Car is accelerating...");
        System.out.println("Current speed: " + speed + " km/h");
    }

    void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}