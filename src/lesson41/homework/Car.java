package lesson41.homework;

public class Car {
    String name, color;
    int price, year, id;
    protected static int idCounter = 0;

    public Car(String name, int year, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
        this.id = idCounter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Id: " + id +
                "\nCar: " + name +
                "\nyear: " + year +
                "\ncolor: " + color +
                "\nprice: " + price + " EUR";
    }

    public void setName(String name) {
    }
}
