package model;
public enum Status {
    DEAD(0), ALIVE(1);
    private final int value;
    Status(int value) { this.value = value; }
    public int getValue() { return value; }
}

