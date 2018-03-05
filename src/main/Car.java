package main;

public class Car {

    String color;
    double speed;
    boolean abs;

    public Car(String color, double speed, boolean abs) {
        this.color = color;
        this.speed = speed;
        this.abs = abs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", abs=" + abs +
                '}';
    }
}
