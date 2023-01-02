package transport;

public class Truck extends Transport implements Competing{
    public enum LoadCapacity{
        N1(0, 3.5F),
        N2(3.5F, 12F),
        N3(12F, 0);
        private float minLoadCapacity;
        private float maxLoadCapacity;

        LoadCapacity(float minLoadCapacity, float maxLoadCapacity) {
            this.minLoadCapacity = minLoadCapacity;
            this.maxLoadCapacity = maxLoadCapacity;
        }

        @Override
        public String toString() {
            if (minLoadCapacity == 0){
                return "Грузоподъемность: " +
                        " до " + maxLoadCapacity;
            }
            if (maxLoadCapacity == 0){
                return "Грузоподъемность: " +
                        "от " + minLoadCapacity;
            }
            return "Грузоподъемность: " +
                    "от " + minLoadCapacity +
                    " до " + maxLoadCapacity;
        }
    }
    private LoadCapacity loadCapacity;
    public Truck(String brand, String model, float engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " +getModel()+ " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " +getModel()+ " закончил движение");
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Грузовой автомобиль " + getBrand()+ " " + getModel() + " " + loadCapacity + " тонн");
        }
    }

    public void pitStop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " +getModel() + " прошел пит-стоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 30);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 70);
    }

}