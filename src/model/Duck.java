package model;

public class Duck extends Animal {
    public Duck(String name, int age, String food, Gender gender, Status status) {
        super(name, age, food, gender, status);
    }

    @Override
    public String printSound() {
        return "Quack";
    }

    @Override
    public String move() {
        return "Duck is swimming";
    }

    @Override
    public String move(int distance) {
        return "The duck named " + name + " swims for " + distance + " meters";
    }

    @Override
    public String printData() {
        return "Type: Duck, Name: " + name + ", Age: " + age + ", Food: " + food +
               ", Gender: " + gender + ", Status: " + status;
    }
}
