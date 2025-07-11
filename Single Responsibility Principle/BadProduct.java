//Single Responsibility Principle (SRP)
//Code snippet violating this principle.

/* 
    Why this violates Single Responsibility Principle:
    The object Product is responsible for both holding product data and displaying information.
    It has two reasons to change: if product data changes or display logic changes.
*/
public class BadProduct {
    private String name;
    private double price;

    public BadProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayPriceInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: Ksh. " + price);
    }

    public class ProductTest {
        public static void main(String[] args) {
            BadProduct product1 = new BadProduct("Pen", 1.50);
            BadProduct product2 = new BadProduct("Notebook", 3.75);

            System.out.println("Testing SRP-violating BadProduct class:");
            product1.displayPriceInfo();
            System.out.println("---");
            product2.displayPriceInfo();
        }
    }
}

