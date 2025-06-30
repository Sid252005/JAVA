public class InvoiceTest {
    public static void main(String[] args) {
        
        Invoice item = new Invoice("P101", "Pen", 5, 12.99);

  
        System.out.println("Part Number: " + item.getPartNumber());
        System.out.println("Description: " + item.getPartDescription());
        System.out.println("Quantity: " + item.getQuantity());
        System.out.println("Price per Item: $" + item.getPricePerItem());

       
        System.out.println("Total Invoice Amount: $" + item.getInvoiceAmount());
    }
}
