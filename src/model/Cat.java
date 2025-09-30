package model;

public class Cat extends Animal {
    public Cat(String name, int age, String food, Gender gender, Status status) {
        super(name, age, food, gender, status);
    }

    @Override
    public String printSound() {
        return "Meow";
    }

    @Override
    public String move() {
        return "Cat is walking";
    }

    @Override
    public String move(int distance) {
        return "The cat named " + name + " walks for " + distance + " meters";
    }

    @Override
    public String printData() {
        return "Type: Cat, Name: " + name + ", Age: " + age + ", Food: " + food +
               ", Gender: " + gender + ", Status: " + status;
    }
}
