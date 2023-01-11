import transport.*;
//import transport.Transport;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.ArrayList;
import java.util.List;

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

        service(
                granta, audi, bmw, kia,
                truck1, truck2, truck3, truck4,
                bus1, bus2, bus3, bus4
        );
        bus1.printType();
        bus2.printType();
        bus3.printType();
        bus4.printType();


        DriverB kolya = new DriverB("Николай", true, 3);
        DriverC syoma = new DriverC("Семён", true, 7);
        DriverD evgen = new DriverD("Евгений", true, 5);

        Mechanic<Car> kolyaM = new Mechanic<Car>("Николай", "Николаев", "ООО Гонки");
        Mechanic<Truck> syomaM = new Mechanic<Truck>("Семён", "Семёнов", "ООО Заезды");
        Mechanic<Bus> evgenM = new Mechanic<Bus>("Евгений", "Евгеньев", "ООО Быстрый пит-стоп");

        List<Transport> transports = List.of(granta, truck1, bus1);
        granta.addDriver (kolya);
        granta.addMechanic(kolyaM);
        printInfo(granta);

        truck1.addDriver (syoma);
        truck1.addMechanic(syomaM);
        printInfo(truck1);

        bus1.addDriver(evgen);
        bus1.addMechanic(evgenM);
        printInfo(bus1);


//        kolya.startMoving(audi);
//        kolya.finishMoving(audi);
//        kolya.refill(audi);
//        kolya.printInfo(audi);
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport){
            try {
                if (!transport.service()) {
                    throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошёл диагностику");
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage()
                );
            }

            }
    private static void printInfo(Transport transport) {
        System.out.println();
        System.out.println("Автомобиль " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители" + transport.getDrivers());
        System.out.println("Механики" + transport.getMechanics());
        System.out.println();
         }
    }











