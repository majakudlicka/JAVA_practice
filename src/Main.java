import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Car myCar = new Car(25, "ABCD", Color.BLUE, true);

        System.out.println(myCar.paintColor);

        myCar.changeColor(Color.CYAN);

        System.out.println(myCar.paintColor);

    }
}
