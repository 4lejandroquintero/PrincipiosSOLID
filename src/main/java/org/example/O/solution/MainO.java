package org.example.O.solution;

public class MainO {
    public static void main(String[] args) {
        // Crear un vehículo
        Vehicle car = new Vehicle();

        // Crear un controlador de eventos para el vehículo
        EventHandler eventHandler = new EventHandler(car);

        // Cambiar al modo Comfort
        Comfort comfortMode = new Comfort();
        eventHandler.changeDrivingMode(comfortMode);

        // Mostrar los detalles del vehículo después de cambiar al modo Comfort
        System.out.println("Modo Comfort:");
        System.out.println("Potencia: " + car.getPower());
        System.out.println("Altura de suspensión: " + car.getSuspensionHeight());

        // Cambiar al modo Economy
        Economy economyMode = new Economy();
        eventHandler.changeDrivingMode(economyMode);

        // Mostrar los detalles del vehículo después de cambiar al modo Economy
        System.out.println("\nModo Economy:");
        System.out.println("Potencia: " + car.getPower());
        System.out.println("Altura de suspensión: " + car.getSuspensionHeight());

        // Cambiar al modo Sport
        Sport sportMode = new Sport();
        eventHandler.changeDrivingMode(sportMode);

        // Mostrar los detalles del vehículo después de cambiar al modo Sport
        System.out.println("\nModo Sport:");
        System.out.println("Potencia: " + car.getPower());
        System.out.println("Altura de suspensión: " + car.getSuspensionHeight());
    }
}
