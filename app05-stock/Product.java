/**
 * Model some details of a product sold by a company.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * 
 * modified by: Warren Frank-Danvers.
 * Date: 08/11/2020
 */
public class Product
{
    // An identifying number for this product.
    public int id;
    // The name of this product.
    public String name;
    // The quantity of this product in stock.
    public int quantity;
    // The Amount of this product which would like to be purchased.
    public int amount;
    

    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        //Quantity shows how much is in stock.
        quantity = 0;
        //Amount stands for how much individual want of the product.
        amount = 0;
    }

    /**
     * @return The product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * @return The product's name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this Product.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }
    
    /**
     * @return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return id + ": Name" +  name + " ,stock level: " + quantity;
    }

    /**
     * @return The id, name and quantity in stock.
     */
    public void printProductDetail()
    {
      System.out.println("ID Number: "+ id + ",Name: " +  name + 
      " ,stock level: " + quantity );
    }
    
    /**
     * Restock with the given amount of this product.
     * The current quantity is incremented by the given amount.
     * @param amount The number of new items added to the stock.
     *               This must be greater than zero.
     */
    public void increaseQuantity(int stock)
    {
        if(stock > 0) 
        {
            quantity += stock;
        }
        else 
        {
            System.out.println("Attempt to restock " + name +
                               " with a non-positive amount: " + amount);
        }
    }

    /**
     * Sell one of these products.
     * An error is reported if there appears to be no stock.
     */
    public void sellOne()
    {
        if(quantity > 0) 
        {
            quantity--;
        }
        else 
        {
            System.out.println(
                "Attempt to sell an out of stock item: " + name);
        }
    }
    
    /**
     * Sell a amount of a product. 
     * An error is reported if there appears to be no stock.
     */
    public void sellNumber(int amount)
    {
        if(quantity > 0) 
        {
            quantity -= amount;
        }
        else 
        {
            System.out.println(
                "Attempt to sell an out of stock item: " + name);
        }
    }
    
    public int getAmount(int amount)
    {
        this.amount = amount;
        return amount;
    }
}
