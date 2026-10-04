package Assignment2;

public class ProductPrice {
    public static void main(String[] args)
    {
        float productPrice = 499.50f;
        int quantity =3;
        float total;
        total = productPrice*quantity;
        System.out.print("Product Price: ");
        System.out.format("%.2f", productPrice);
        System.out.println("");
        System.out.println("Quantity : " +quantity);
        System.out.print("Total Price: " );
        System.out.format("%.2f", total);

    }
}
