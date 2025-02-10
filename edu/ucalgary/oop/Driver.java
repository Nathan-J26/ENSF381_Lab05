package edu.ucalgary.oop;

public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }
    public Driver(Driver other) {
        this.name = other.name;
    }
    public String getName() {
        return this.name;
    }
    public void setname(String name) {
        this.name = name;
    }
}
