
public class Shirt {

    public int shirtID = 451; // стандартне значення номера моделі сорочки
    public String description = "Soft cotton fabric provides low creasing and wearing comfort. Suitable for different styles of clothing."; // стандартний опис сорочки
    // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
    public String color = "Unset";
    public double price = 225.0; // стандартна вартість сорочки
    public int quantityInStock = 0; // стандартна кількість на складі

    // цей метод просто виводить всю інформацію про сорочку на екран
    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color: " + color);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    } // кінець методу displayShirtInformation
} // кінець опису класу
