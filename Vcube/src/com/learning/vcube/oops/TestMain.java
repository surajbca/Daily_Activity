
class Product {
    protected int productId;
    protected String productName;
    protected double price;

   
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    
    public double calculateDiscount() {
        return 0.0;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: $" + price);
    }
}

class Electronics extends Product {
    private String brand; 

    public Electronics(int productId, String productName, double price, String brand) {
        super(productId, productName, price);
        this.brand = brand;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10; 
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Brand: " + brand);
    }
}

class Clothing extends Product {
    private String size; 

    public Clothing(int productId, String productName, double price, String size) {
        super(productId, productName, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Size: " + size);
    }
}

class Furniture extends Product {
    private String material;

    public Furniture(int productId, String productName, double price, String material) {
        super(productId, productName, price);
        this.material = material;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.15; 
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Material: " + material);
    }
}


public class TestMain {
    public static void main(String[] args) {
       
        Electronics laptop = new Electronics(101, "Laptop", 1200.0, "Dell");
        Clothing tShirt = new Clothing(202, "T-Shirt", 50.0, "L");
        Furniture sofa = new Furniture(303, "Sofa", 800.0, "Teak Wood");

        Product[] inventory = { laptop, tShirt, sofa };

        System.out.println("================ INVENTORY DETAILS ================");
        for (Product product : inventory) {
            product.displayProductDetails();
            
            double discount = product.calculateDiscount();
            double finalPrice = product.price - discount;
            
            System.out.println("Discount Applied: $" + discount);
            System.out.println("Final Price: $" + finalPrice);
            System.out.println("-------------------------------------------------");
        }
    }
}
