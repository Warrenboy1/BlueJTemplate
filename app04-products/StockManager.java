import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Warren Frank-Danvers 
 * @version 30th Oct 2020
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;
    private int amount;
    
    

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product name)
    {
        stock.add(name);
    }
    
    /**
     * Remove a product from the list
     */
    public void removeProduct(int id)
    {
        for (Product product : stock)
        {
        if (product.id == id)
        {
            stock.remove(product);
        }
    }
    }
    
    //if(amount > 0)[]if else ();
    /**
     * Sell a product from the list. verifying the id first.
     * then input the amount sold.
     * @param id The ID of the product.
     * @param amount The amount the product has been sold by.
     */
    public void sellProduct(int id, int amount)
    {
        for (Product product : stock)
        {
            if (product.id == id && amount > 0)
            {
              product.quantity -= amount;
              product.printProductDetail();
            }
        }
    }
    
    
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        for (Product product : stock)
        {
            if (product.id == id)
            {
              product.increaseQuantity(amount);
              product.getID();
              product.getQuantity();
            
              product.printProductDetail();
            }
        }
    }
    
    
    public void searchProductName(String keyWord)
    {
        for (Product product : stock)
         {
            if (product.getName().contains(keyWord)!= false)  
            {
                System.out.println(product);
                
            }
        }
        
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProductID(int id)
    {
        for (Product product : stock)
        {
           if (product.id == id)
            {
               product.printProductDetail();
           }
        }
        return null;
    }
    
    public void listAllProducts ()
    {
        for (Product product : stock)
        {  
           
               product.printProductDetail();
            
        }
        
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        for (Product product : stock)
        {
           if (product.id == id)
           
           {
                product.printProductDetail();
           }
           else if (product.id != id)
           {
               System.out.println(" ");
           }
        }
        return id;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
       for (Product product : stock)
       {
           if(product != null) 
           {
               product.toString();
        
           }
       }
    }
    
    public void renameName(int id, String replacementName)
    {
        for (Product product : stock)
        {
            if (product.id == id)
            {
                product.changeName(replacementName);
            }
            
        }
    }
    
    public void printStockLevelsLow ()
    {
        for (Product product : stock) 
        {
            if (product.getQuantity() <5)
            {
                System.out.println(product); 
            }
        }
    }
    
    public void topUpWith10 ()
    {
        for (Product product : stock)
        {
            if (product.getQuantity() < 5)
            {
                product.increaseQuantity(10);
                System.out.println(product);
            }
        }
    }
}
    


