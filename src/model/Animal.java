package model;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String food;
    protected Gender gender;
    protected Status status;

    public Animal(String name, int age, String food, Gender gender, Status status) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.status = status;
    }

    public abstract String printSound();
    public abstract String move();
    public abstract String move(int distance);
    public abstract String printData();

    public boolean isAlive() {
        return status == Status.ALIVE;
    }
}