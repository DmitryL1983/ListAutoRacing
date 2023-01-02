import transport.Bus;
import transport.Car;
import transport.Truck;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 1.7F, Car.TypeOfBody.SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0F, Car.TypeOfBody.SEDAN);
        Car bmw = new Car("BMW", "Z8", 3.0F, Car.TypeOfBody.COUPE);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 1.7F, Car.TypeOfBody.OFFROAD);
        granta.printType();
        audi.printType();
        bmw.printType();
        kia.printType();
        System.out.println();
        Truck truck1 = new Truck("Урал-М", "55571-3121-80", 6.65F, Truck.LoadCapacity.N2);
        Truck truck2 = new Truck("Урал-М", "4320-3171-80", 6.65F, Truck.LoadCapacity.N2);
        Truck truck3 = new Truck("Урал", "6370 63704К-0111", 11.12F, Truck.LoadCapacity.N3);
        Truck truck4 = new Truck("Урал", "Next", 6.65F, Truck.LoadCapacity.N2);
        truck1.printType();
        truck2.printType();
        truck3.printType();
        truck4.printType();
        System.out.println();
        Bus bus1 = new Bus("ПАЗ", "3205", 10F, Bus.Сapacity.SMALL);
        Bus bus2 = new Bus("ЛиАЗ", "677", 10F, Bus.Сapacity.EXTRA_SMALL);
        Bus bus3 = new Bus("ЛиАЗ", "5292", 10F, Bus.Сapacity.LARGE);
        Bus bus4 = new Bus("ПАЗ", "3292", 10F, Bus.Сapacity.MEDIUM);
        bus1.printType();
        bus2.printType();
        bus3.printType();
        bus4.printType();
        DriverB kolya = new DriverB("Николай", true, 3);
        DriverC syoma = new DriverC("Семён", true, 7);
        DriverD evgen = new DriverD("Евгений", true, 5);

//        kolya.startMoving(audi);
//        kolya.finishMoving(audi);
//        kolya.refill(audi);
//        kolya.printInfo(audi);
    }

}