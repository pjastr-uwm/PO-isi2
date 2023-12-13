package zlozone.zad7;

public class Car {

    private String make;
    private String model;

    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine == null ? new Engine(0,"","")
                : new Engine(engine.getPower(), engine.getType(), engine.getSerialNumber());
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return new Engine(this.engine.getPower(),
                this.engine.getType(), this.engine.getSerialNumber());
    }

    public void setEngine(Engine engine) {
        if (engine != null)
            this.engine = new Engine(engine.getPower(), engine.getType(), engine.getSerialNumber());
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
