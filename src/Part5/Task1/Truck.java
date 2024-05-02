package Part5.Task1;

class Truck extends Vehicle {
    // Додаткові поля для підкласу Truck
    private int loadCapacity;
    public Truck(String color, int loadCapacity) {
        super(color);
        this.loadCapacity = loadCapacity;
    }
}

