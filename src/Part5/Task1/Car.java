package Part5.Task1;

class Car extends Vehicle {
    // Додаткові поля для підкласу Car
    private String model;
    public Car(String color, String model) {
        super(color);
        this.model = model;
    }
}

