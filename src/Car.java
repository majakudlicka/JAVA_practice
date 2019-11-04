import java.awt.*;

public class Car {
    int averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;

    public Car(int averageMilesPerGallon, String licensePlate, Color paintColor, boolean areTailingWorking) {
        this.averageMilesPerGallon = averageMilesPerGallon;
        this.licensePlate = licensePlate;
        this.paintColor = paintColor;
        this.areTailingWorking = areTailingWorking;
    }

    public void changeColor(Color newColor) {
        this.paintColor = newColor;
    }

}
