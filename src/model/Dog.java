package model;

public class Dog extends Animal {
    public Dog(String name, int age, String food, Gender gender, Status status) {
        super(name, age, food, gender, status);
    }

    @Override
    public String printSound() {
        return "Woof";
    }

    @Override
    public String move() {
        return "Dog is running";
    }

    @Override
    public String move(int distance) {
        return "The dog named " + name + " runs for " + distance + " meters";
    }

    @Override
    public String printData() {
        return "Type: Dog, Name: " + name + ", Age: " + age + ", Food: " + food +
               ", Gender: " + gender + ", Status: " + status;
    }
}
