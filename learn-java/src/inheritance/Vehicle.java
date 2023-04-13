package inheritance;

public class Vehicle implements Engine {

    int numberOfSeats;
    int numberOfWheels;

    public void start(){
        System.out.println("Vehicle started...");
    }

    @Override
    public void stop() {

        System.out.println("Vehicle stopped...");

    }
}
