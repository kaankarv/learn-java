package inheritance;

public class Main {

    public static void main(String[] args){
        Car car = new Car();
        car.numberOfSeats = 5;
        car.numberOfWheels = 4;

        Bus bus = new Bus();
        bus.numberOfSeats = 12;
        bus.numberOfWheels = 10;

        Vehicle bus2 = new Bus();

        car.start();
        bus.start();
        bus2.start();
        bus2.stop();

        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = car;
        vehicles[1] = bus;
        vehicles[2] = bus2;

}
}
