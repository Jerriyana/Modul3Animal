package model;

public class Horse extends Animal {
    public Horse(String name, int age, String food, Gender gender, Status status) {
        super(name, age, food, gender, status);
    }

    @Override
    public String printSound() {
        return "Neigh";
    }

    @Override
    public String move() {
        return "Horse is galloping";
    }

    @Override
    public String move(int distance) {
        return "The horse named " + name + " gallops for " + distance + " meters";
    }

    @Override
    public String printData() {
        return "Type: Horse, Name: " + name + ", Age: " + age + ", Food: " + food +
               ", Gender: " + gender + ", Status: " + status;
    }
}
