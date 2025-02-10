package edu.ucalgary.oop;
public class Car {
    private String model;
    private Driver driver;
    private Engine engine;

    public Car(String model, Driver driver, Engine engine){
        this.model = model;
        this.driver = driver;
        this.engine = engine;
    }

    public Car copy(boolean deepcopy){
        if (deepcopy){
            return new Car(this.model, new Driver(this.driver), new Engine(this.engine));
        } else {
            return new Car(this.model, this.driver, this.engine);
        }
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public Driver getDriver(){
        return this.driver;
    }

    public String getModel(){
        return this.model;
    }
}
