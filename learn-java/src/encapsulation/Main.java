package encapsulation;

public class Main {

    public static void main(String[] args){
        Pen firstPen = new Pen();
        firstPen.setColor("red");
        firstPen.setHeight(10);
        String message = "First pen created.";

        firstPen.writeMessage(message);

        Pen secondPen = new Pen();
        secondPen.setColor("blue");
        secondPen.setHeight(8);
        secondPen.writeMessage(secondPen.getColor() + " " + secondPen.getHeight());
    }
}
