public class Main {
    public static void main(String[] args) {
        // Creăm un obiect Square (Pătrat)
        ShapeInterface square = new Square(5);  // latura pătratului = 5
        System.out.println("Aria pătratului: " + square.area());

        // Creăm un obiect Cuboid (Paralelipiped)
        Cuboid cuboid = new Cuboid(4, 6, 8);  // lățimea = 4, înălțimea = 6, lungimea = 8
        System.out.println("Aria paralelipipedului: " + cuboid.area());
        System.out.println("Volumul paralelipipedului: " + cuboid.volume());
    }
}