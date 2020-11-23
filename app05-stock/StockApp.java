
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Warren Frank-Danvers
 * @version 0.1
 */
public class StockApp
{
    public static final char CLEAR_CODE = '\u000C';
    
    public static final String QUIT = "quit";
    public static final String ADD = "add";
    public static final String PRINT_ALL = "printall";
    public static final String REMOVE = "remove";
    public static final String DELIVER = "deliver";
    public static final String SELL = "sell";
    public static final String SEARCH = "search";
    public static final String LOW_STOCK = "lowstock";
    
    // Use to get user input
    private InputReader input = new InputReader();
    private StockManager manager = new StockManager();
    private StockDemo demo = new StockDemo(manager);
     
 
    
    public void run() 
    {
        System.out.println(CLEAR_CODE);
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getString().toLowerCase();
            
            if(choice.equals(QUIT))
                 finished = true;
            else     
                 executeMenuChoice(choice);
        }
    }
   
    private void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {
            addProduct(); 
        }
        else if(choice.equals(PRINT_ALL))
        {
            manager.listAllProducts();
        }
        else if(choice.equals(REMOVE))
        {
            removeProduct();
        }
        else if(choice.equals(DELIVER))
        {
            delivery();
        }
        else if(choice.equals(SELL))
        {
            sell();
        }
        else if(choice.equals(SEARCH))
        {
            search();
        }
        else if(choice.equals(LOW_STOCK))
        {
            lowStock();
        }
    }
    
    private void removeProduct()
    {
        System.out.println("Removing a Product\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        manager.removeProduct(id);
        
        manager.listAllProducts();
        
        System.out.println();
    }
    
    private void addProduct()
    {
        System.out.println("Adding new product\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the name of the product");
        String name = input.getString();
        
        Product product = new Product(id, name);
        manager.addProduct(product);
        
        
        System.out.println();
    }
    
    private void delivery()
    {
        System.out.println("Deliver new products\n");
        
        System.out.println("Please enter the product ID to be delivered");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("please enter the name of the product");
        String worth = input.getString();
        int quantity = Integer.parseInt(worth);
        
        manager.delivery(id, quantity);
        
        System.out.println();
    }
    
    private void sell()
    {
        System.out.println("Sell a product");
        
        System.out.println("Please enter the product ID to be sold");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the amount sold");
        String worth = input.getString();
        int amount = Integer.parseInt(worth);
        
        manager.sellAProduct(id, amount);
        
        System.out.println();
    }
    
    private void search()
    {
        System.out.println("Search for a product");
        
        System.out.println("Please enter the name of the product");
        String keyWord = input.getString();
        
        manager.searchProductName(keyWord);
        
        System.out.println();
    }
    
    private void lowStock()
    {
        System.out.println("Printing low stock");
        
        System.out.println("Enter the number for how many products you want to see are low in stock");
        String low = input.getString();
        int number = Integer.parseInt(low);
        
        manager.printStockLevelsLow(number);
        
        System.out.println();
    }
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println("    Deliver:    Deliver a product");
        System.out.println("    Sell:       Sell a product");
        System.out.println("    Search:     Search for a product");
        System.out.println("    LowStock:   Print all product with low stock");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Warren Frank-Danvers");
        System.out.println("******************************");
    }
    
    
}
