public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        double[] itemsCost = {29.99, 15.99, 4.99, 8.99}; // Array of item costs
        double taxRate = 0.08; // Tax rate (8% in this example)
 
        // Create an instance of OrderProcessor of not refactored class
        OrderProcessor orderProcessor = new OrderProcessor(itemsCost, taxRate); 
        orderProcessor.processOrder();

        System.out.println("\nAfter refactoring\n");
        // After refactoring
        RefactoredOrderProcessor refactoredOrderProcessor = new RefactoredOrderProcessor(itemsCost, taxRate);
        refactoredOrderProcessor.processOrder();
     
    }
}


