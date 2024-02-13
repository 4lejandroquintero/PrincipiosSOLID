package org.example.L.solution;

public class MainL {
    public static void main(String[] args) {
        // Crear una instancia de Duck
        Duck duck = new Duck();

        // Duck hereda el método eat() de Bird
        duck.eat();

        // Duck hereda el método fly() de FlyingBird
        duck.fly();

        // Crear una instancia de Ostrich
        Ostrich ostrich = new Ostrich();

        // Ostrich hereda el método eat() de Bird
        ostrich.eat();

        // Ostrich no puede volar ya que no hereda de FlyingBird
        // ostrich.fly(); // Esto dará un error en tiempo de compilación
    }
}
