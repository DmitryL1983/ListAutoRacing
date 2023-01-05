package transport;

import java.util.PrimitiveIterator;

public class Bus extends Transport implements Competing{
    public enum Сapacity{
        EXTRA_SMALL(0,10),
        SMALL(10,25),
        MEDIUM(40,50),
        LARGE(60,80),
        EXTRA_LARGE(100,120);
        private int minСapacity;
        private int maxСapacity;

        Сapacity(int minСapacity, int maxСapacity) {
            this.minСapacity = minСapacity;
            this.maxСapacity = maxСapacity;
        }

        @Override
        public String toString() {
            if (minСapacity == 0) {
                return "Вместимость: " + "до " +
                        maxСapacity + " мест";
            }
            return "Вместимость: " + minСapacity + " - " +
                    maxСapacity + " мест";
        }
    }
    private Сapacity capacity;
    public Bus(String brand, String model, float engineVolume, Сapacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Сapacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Сapacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Автобус " + getBrand() + " " +getModel()+ " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус " + getBrand() + " " +getModel()+ " закончил движение");
    }

    @Override
    public boolean service() {
        System.out.println("Автобус "+ getBrand() + " " + getModel() + "в диагностика не требуется");
        return true;
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Автобус " + getBrand()+ " " + getModel() + " " + capacity);
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " +getModel() + " прошел пит-стоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 20);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 90);
    }
}