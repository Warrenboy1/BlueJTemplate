/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * 
 * modified by: Warren Frank-Danvers.
 * Date: 08/11/2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    private Product product; 

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        manager.addProduct(new Product(0, "Clock Radio"));
        manager.addProduct(new Product(1,  "Mobile Phone"));
        manager.addProduct(new Product(2,  "Microwave Oven"));
        manager.addProduct(new Product(3, "Iphone")); 
        manager.addProduct(new Product(4, "Water Bottle"));
        manager.addProduct(new Product(5, "Playstation 5"));
        manager.addProduct(new Product(6, "AA Batteries"));
        manager.addProduct(new Product(7, "Sticky Tape"));
        manager.addProduct(new Product(8, "Head and Shoulders"));
        manager.addProduct(new Product(9, "Deodorant")); 
        // Show details of all of the products.
        manager.listAllProducts();
    } 
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDeliverProducts()
    {
        // Take delivery of 10 items of one of the products.
        manager.delivery(0, 8);
        manager.delivery(1, 3);
        manager.delivery(2, 7);
        manager.delivery(3, 9);
        manager.delivery(4, 7);
        manager.delivery(5, 8);
        manager.delivery(6, 5);
        manager.delivery(7, 6);
        manager.delivery(8, 4);
        manager.delivery(9, 7);
        manager.returnAllToString();
        System.out.println('\n');
    }
    
     /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for. 
     */
    public void showDetails(int id)
    {
        manager.findProductID(id);
    }
    
      /**
     * Sell an amount of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void demoSellProducts(int id, int amount)
    {
        manager.sellAProduct(id,amount);
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public void demoFindProductID(int id)
    {
        manager.findProductID(id);
    } 

    /**
     * @return The stock manager.
     */
    public StockManager demoGetManager()
    {
        return manager;
    }
    
    /**
     * Add a product to the list.
     */
    public void demoAddProduct(Product name)
    {
        manager.addProduct(name);
    }
    
    /**
     * Remove a product from the list using id.
     */
    public void demoRemoveProduct(int id)
    {
        manager.removeProduct(id);
    }
    
    /**
     * search Product Name via a keyword.
     */
    public void demoSearchProductName(String keyWord)
    {
        manager.searchProductName(keyWord);
    }
    
    
    /**
     * All Products get listed.
     */
    public void demoListAllProducts()
    {
        manager.listAllProducts();
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     */
    public void demoNumberInStock(int id)
    {
        manager.numberInStock(id);
    }
    
    /**
     * return details of all the products.
     */
    public void demoReturnAllToString()
    {
        manager.returnAllToString();
    }
    
    /**
     * rename product with replacementname.
     */
    public void demoRenameName(int id, String replacementName)
    {
        manager.renameName(id, replacementName);
    }
    
    /**
      * Print out Produts with less than 5 as Quantity.
      */
    public void demoPrintStockLevelsLow()
    {
        manager.printStockLevelsLow();
    }
    
    /**
     * Increase Quantity of Products with less than 5. increased by 10.
     */
    public void demoTopUpWith10()
    {
        manager.topUpWith10();
    }
    
    /**
     * Sell multiple products with the amount within certain products which 
     * do not have an amount of 0,if they do then the quantity of the product
     * will be reduced by amount specified.
     */
    public void demoSellMultipleProducts()
    {
        manager.sellMultipleProducts();
    }
    
    /**
     * input an ID to set an amount to. 
     * To sell multiple products at one time instead of selling 1 at a time.
     */
    public void demoSelectAmount(int id, int input)
    {
        manager.selectAmount(id, input);
    }
}
