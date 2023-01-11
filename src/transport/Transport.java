package transport;
import transport.driver.Driver;
import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private float engineVolume;
    public Transport(String brand, String model, float engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();

    public List<Driver<?>> getDrivers() {
        return drivers;
    }
    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }
    public void addDriver(Driver<?> driver){
        drivers.add(driver);
    }
    public void addMechanic(Mechanic<?> mechanic){
        mechanics.add(mechanic);
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public float getEngineVolume() {
        return engineVolume;
    }
    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else this.brand = "default";
    }
    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else this.model = "default";
    }
    public void setEngineVolume(float engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else this.engineVolume = 1.5F;
    }
    private Car.TypeOfBody typeOfBody;
    public Car.TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public abstract void printType();
    public abstract void start();
    public abstract void stop();

    public abstract boolean service();
    public abstract void repair();
}