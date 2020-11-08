import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Warren Frank-Danvers.
 * @version 08.11.2020
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;
    private Product product;
    
    
    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     */
    public void addProduct(Product name)
    {
        stock.add(name); 
    }
    
    /**
     * Remove a product from the list using id.
     */
    public void removeProduct(int id)
    {
           stock.remove(id);
    }
    
    /**
     * Sell a product from the list. verifying the id first.
     * then input the amount sold.
     * @param id The ID of the product.
     * @param amount The amount the product has been sold by.
     */
    public void sellAProduct(int id, int amount)
    {
        for (Product product : stock)
        {
            if (product.id == id && amount <= product.quantity)
            {
              product.quantity -= amount;
              product.printProductDetail();
            }
            else if (product.id == id && amount > product.quantity)
            {
                System.out.println("Quantity is: " + product.quantity + 
                "compared to amount selected for purchase: " + product.amount + " for ID: " +
                product.id);
            }
        }
        System.out.println('\n');
    }
    
    
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int quantity)
    {
        for (Product product : stock)
        {
            if (product.id == id)
            {
              product.increaseQuantity(quantity);
              product.printProductDetail();
              
            }
        }
    }
    
    
    /**
     * search Product Name via a keyword.
     */
    public void searchProductName(String keyWord)
    {
        for (Product product : stock)
         {
            if (product.getName().contains(keyWord)!= false)  
            {
                System.out.println(product);
            }
        }
        System.out.println('\n');
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or "item not found" if there is none
     *         with a matching ID.
     */
    public void findProductID(int id)
    {
        for (Product product : stock)
        {
           if (product.id == id)
           {
               product.printProductDetail();
           }
           else if(product.id != id)
           {
               System.out.println("Item not Found");
           }
        }
        System.out.println('\n');
    }
    
    /**
     * All Products get listed.
     */
    public void listAllProducts()
    {
        for (Product product : stock)
        {  
               product.printProductDetail();
        }
        System.out.println('\n');
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
           if (product.id == id)
           {
                product.printProductDetail();
                System.out.println("Number in Stock: " + product.quantity);
           }
           else if (product.id != id)
           {
               System.out.println
               ("ID not found. if not sure then use ListAllProducts method. ");
           }
           System.out.println('\n');
           return id;
    }

    /**
     * return details of all the products.
     */
    public void returnAllToString()
    {
       for (Product product : stock)
       {
           if(product != null) 
           {
               product.toString();
           }
       }
    }
    
    /**
     * rename product with replacementname.
     */
    public void renameName(int id, String replacementName)
    {
       for (Product product : stock)
       {    
          if (product.id == id)
            {
                product.changeName(replacementName);
            }
       }     
        System.out.println('\n');
    }
    
     /**
      * Print out Produts with less than 5 as Quantity.
      */
     public void printStockLevelsLow ()
    {
        System.out.println
        ("If no products printed then no products are below 5");
        for (Product product : stock) 
        {
            if (product.getQuantity() <5)
            {
                System.out.println(product); 
            }
        }
        System.out.println('\n');
    }
    
    
    /**
     * Increase Quantity of Products with less than 5. increased by 10.
     */
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
        System.out.println('\n');
    }
    
     /**
     * Sell multiple products with the amount within certain products which 
     * do not have an amount of 0,if they do then the quantity of the product
     * will be reduced by amount specified.
     */
    public void sellMultipleProducts ()
    {
        for (Product product : stock)
        {
            if(product.amount <= product.quantity)
            {
                product.quantity -= product.amount;
                product.printProductDetail();
                
            }
            else if(product.amount > product.quantity)
                {
                 System.out.println("ERROR: Cant sell:  ID Number: "+ 
                 product.id + ",Name: "+  product.name + " ,stock level: "
                 + product.quantity + "    Reason: " + product.amount + 
                 " amount requested exceeds quantity in stock of " + 
                 product.quantity);
                }
        }
        System.out.println('\n');
    }
    
    /**
     * input an ID to set an amount to. 
     * To sell multiple products at one time instead of selling 1 at a time.
     */
    public void selectAmount(int id, int input)
    {
            for (Product product : stock)
        {
            if(product.id == id && product.amount >= 0)
            {
                product.getAmount(input);
                System.out.println("ID: " + id +
                "  has been requested for an amount of " + input);
            }
            else if(product.id == id && product.amount < 0)
            {
                System.out.println(
                "An Error has occured for " + id + 
                "Please make sure to have an amount more then 0");
            }
        } 
        System.out.println('\n');
    }
}
    


