package org.example.I.solution;

public class MainI {
    public static void main(String[] args) {
        // Crear un coche
        Car car = new Car();

        // Encender el motor del coche
        car.startEngine();

        // Encender la radio del coche
        car.turnRadioOn();

        // Crear un dron
        Drone drone = new Drone();

        // Encender el motor del dron
        drone.startEngine();

        // Encender la cámara del dron
        drone.turnCameraOn();

        // Apagar la cámara del dron
        drone.turnCameraOff();
    }
}
