package org.example.D.solution;

public class MainD {
    public static void main(String[] args) {
        // Crear un RacingCar con 10 unidades de combustible
        RacingCar racingCar = new RacingCar(10);

        // Crear un Driver para el RacingCar
        Driver driver = new Driver(racingCar);

        // Mostrar la potencia inicial y el combustible restante del RacingCar
        System.out.println("Potencia inicial del RacingCar: " + racingCar.getPower());
        System.out.println("Combustible restante del RacingCar: " + racingCar.getRemainingFuel());

        // Incrementar la velocidad del RacingCar
        driver.increaseSpeed();

        // Mostrar la potencia actual y el combustible restante del RacingCar después de aumentar la velocidad
        System.out.println("Potencia actual del RacingCar: " + racingCar.getPower());
        System.out.println("Combustible restante del RacingCar: " + racingCar.getRemainingFuel());
    }
}
