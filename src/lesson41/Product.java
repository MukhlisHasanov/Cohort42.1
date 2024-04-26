package lesson41;

public class Product {
    String name, color;
    int price, year, id;
    protected static int idCounter = 0;

    public Product(String name, int year, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
        this.id = idCounter;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Car: " + name +
                "\nyear: " + year +
                "\ncolor: " + color +
                "\nprice: " + price + " EUR";
    }

    public void setName(String name) {
    }
}
