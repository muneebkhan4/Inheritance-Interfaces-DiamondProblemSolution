// -------------------------------- IVehicale Interface  -------------------------- //

interface IVehicle {
    void getMilage();
}

// -------------------------------- ICar Interface  -------------------------- //
interface ICar extends IVehicle {
    void getNoOfWheels();
}

// -------------------------------- IBoat Interface  -------------------------- //
interface IBoat extends IVehicle {
    void loadCapacity();
}

// -------------------------------- IAmphicar Interface  -------------------------- //
interface IAmphicar extends ICar, IBoat {

}

// -------------------------------- Car Class  -------------------------- //
class Car implements ICar {

    @Override
    public void getMilage() {
        System.out.println("Car Milage is bad...");

    }

    @Override
    public void getNoOfWheels() {
        System.out.println("Car has 4 wheels...");
    }

}

// -------------------------------- Boat Class  -------------------------- //
class Boat implements IBoat {

    @Override
    public void getMilage() {
        System.out.println("Milage of Boat is Good...");
    }

    @Override
    public void loadCapacity() {
        System.out.println("Load capacity of Boat is 100 kg!");
    }

}

// -------------------------------- Amphicar Class  -------------------------- //
class Amphicar implements ICar, IBoat {

    @Override
    public void getMilage() {
        System.out.println("Milage of Amphicar is execllent!");
    }

    @Override
    public void loadCapacity() {
        System.out.println("Load capacity of Amphicar is 500 kg!");
    }

    @Override
    public void getNoOfWheels() {
        System.out.println("AmphiCar has 12 wheels!");
    }
}

// -------------------------------- Main Class  -------------------------- //
class Q1 {

    public static void main(String arg[]) {
        Car c = new Car();              // car object
        Boat b = new Boat();            // boat object
        Amphicar a = new Amphicar();    // amphicar object

        System.out.println("Car:");
        c.getMilage();
        c.getNoOfWheels();

        System.out.println("\nBoat:");
        b.getMilage();
        b.loadCapacity();

        System.out.println("\nAmphicar:");
        a.getMilage();
        a.getNoOfWheels();
        a.loadCapacity();
    }

}

// Explanation
// Java do not support multiple inheritance. So the solution is 
// to use interface for Car and Boat, as any class can implement
// multiple interfaces. Amphicar can not inherit concreate/ abstract 
// class of Car and Boat at the same time. That is why we will use 
// the above appprach of using interfaces
