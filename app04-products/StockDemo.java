/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * 
 * modified by: Warren Frank-Danvers.
 * Date: 06/11/2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo()
    {
        manager = new StockManager();
        manager.addProduct(new Product(132, "Clock Radio"));
        manager.addProduct(new Product(37,  "Mobile Phone"));
        manager.addProduct(new Product(23,  "Microwave Oven"));
        manager.addProduct(new Product(1, "Iphone"));
        manager.addProduct(new Product(2, "Water Bottle"));
        manager.addProduct(new Product(3, "Playstation 5"));
        manager.addProduct(new Product(4, "AA Batteries"));
        manager.addProduct(new Product(5, "Sticky Tape"));
        manager.addProduct(new Product(53, "Head and Shoulders"));
        manager.addProduct(new Product(76, "Deodorant"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demo()
    {
        // Show details of all of the products.
        manager.printToString(); 
        // Take delivery of 5 items of one of the products.
        manager.delivery(132, 8);
        manager.delivery(37, 3);
        manager.delivery(23, 7);
        manager.delivery(1, 9);
        manager.delivery(3, 7);
        manager.delivery(2, 8);
        manager.delivery(5, 5);
        manager.delivery(4, 6);
        manager.delivery(76, 4);
        manager.delivery(53, 7);
        manager.printToString();
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellAProduct(int id)
    {
        Product product = getProduct(id);
       
        
        if(product != null) 
        {
            showDetails(id);
            product.sellOne();
            showDetails(id);
        }
    
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProductID(id);  
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
