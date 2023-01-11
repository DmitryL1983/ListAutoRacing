package transport.driver;

import transport.Transport;

public abstract class Driver <T extends Transport>{
    private final String name;
    private boolean hasDrivingLicense;
    private int experience;

    public Driver(String name, boolean hasDrivingLicense, int experience) {
        this.name = name;
        this.hasDrivingLicense = hasDrivingLicense;
        this.experience = experience;
       // setExperience(experience);
    }

    public String getName() {
        return name;
    }

    public boolean isHasDrivingLicense() {
        return hasDrivingLicense;
    }

    public void setHasDrivingLicense(boolean hasDrivingLicense) {
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) throws IllegalAccessException {
        if (experience==0){
            throw new IllegalAccessException("Необходимо указать категорию прав!");
        }
        this.experience = experience;
    }

    public abstract void startMoving(T transport);
    public abstract void finishMoving(T transport);
    public abstract void refill(T transport);
    public void printInfo(T transport){
        System.out.println("Водитель " + name + " управляет транспортным средством " + transport.getBrand() + " " + transport.getModel());
    }
    @Override
    public String toString() {
        return name +
                ", со стажем " + experience +
                " лет";
    }
}
