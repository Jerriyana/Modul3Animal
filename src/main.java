import model.*;
import controller.*;
import view.*;  
public class main {
    public static void main(String[] args) {
        // Membuat instance hewan
        Animal cat = new Cat("Milo", 2, "Fish", Gender.MALE, Status.ALIVE);
        Animal dog = new Dog("Max", 3, "Bone", Gender.MALE, Status.ALIVE);
        Animal duck = new Duck("Stacy", 1, "Seeds", Gender.FEMALE, Status.ALIVE);
        Animal horse = new Horse("Thunder", 5, "Hay", Gender.FEMALE, Status.DEAD);

        // Membuat view
        AnimalView view = new AnimalView();

        // Membuat controller untuk masing-masing hewan
        AnimalController catController = new AnimalController(cat, view);
        AnimalController dogController = new AnimalController(dog, view);
        AnimalController duckController = new AnimalController(duck, view);
        AnimalController horseController = new AnimalController(horse, view);

        // Menampilkan data untuk setiap hewan
        System.out.println("=== Cat ===");
        catController.showData();
        catController.showSound();
        catController.showMove();
        catController.showMoveWithDistance(5);
        catController.showAliveStatus();

        System.out.println("\n=== Dog ===");
        dogController.showData();
        dogController.showSound();
        dogController.showMove();
        dogController.showMoveWithDistance(10);
        dogController.showAliveStatus();

        System.out.println("\n=== Duck ===");
        duckController.showData();
        duckController.showSound();
        duckController.showMove();
        duckController.showMoveWithDistance(3);
        duckController.showAliveStatus();

        System.out.println("\n=== Horse ===");
        horseController.showData();
        horseController.showSound();
        horseController.showMove();
        horseController.showMoveWithDistance(15);
        horseController.showAliveStatus();
    }
}