package org.example.S.solution;

import org.example.S.solution.FuelPump;
import org.example.S.solution.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Crear un vehículo con un máximo de 50 unidades de combustible
        Vehicle car = new Vehicle(50);

        // Mostrar el combustible restante antes de repostar
        System.out.println("Combustible restante antes de repostar: " + car.getRemainingFuel());

        // Crear una bomba de combustible
        FuelPump fuelPump = new FuelPump();

        // Repostar el vehículo
        fuelPump.reFuel(car);

        // Mostrar el combustible restante después de repostar
        System.out.println("Combustible restante después de repostar: " + car.getRemainingFuel());

        // Hacer que el vehículo acelere
        car.accelerate();

        // Mostrar el combustible restante después de acelerar
        System.out.println("Combustible restante después de acelerar: " + car.getRemainingFuel());
    }
}
