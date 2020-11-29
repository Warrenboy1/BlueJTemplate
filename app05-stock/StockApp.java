
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
    public static final char CLEAR_CODE = '\u000C';// Clears the code in terminal window.
    
    public static final String QUIT = "quit";   //Quit Application
    public static final String ADD = "add";   //Add Product using input 'add' within terminal window
    public static final String PRINT_ALL = "printall";  //print Product using input 'printall'
    public static final String REMOVE = "remove";   //Remove product using input 'remove'
    public static final String DELIVER = "deliver";     //Deliver products using input 'deliver'    
    public static final String SELL = "sell";   //Sell products using input 'sell'
    public static final String SEARCH = "search";   //Search for products using input 'search'
    public static final String LOW_STOCK = "lowstock";  //prints lowstock items
    public static final String RE_STOCK = "restock";    //Restocks items
    
    // Use to get user input
    private InputReader input = new InputReader();
    // Class StockManager name is also 'manager'
    private StockManager manager = new StockManager();
    // Class StockDemo name is also 'demo'
    private StockDemo demo = new StockDemo(manager);
    /**
     * Everytime Constructor runs, the terminal window is cleared incase of previous information was stored, then boolean finished is set to false and while that is
     * still false the program will run with whatever input the user has the matches the strings made/what printMenuChoices() has listed. Otherwise the boolean finished
     * is set to true thus ending the program.
     * 
     * Else the user input automatically switches to lowercase in the case that the user input involves UpperCase
     */
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
                 finished = true;   //Ends the program if user input 'quit'
            else     
                 executeMenuChoice(choice);  //execute the choice if matches the method.
        }
    }
   
    /**
     *  Executes menu choice depending on what the user inputs, as long as it matches, the method will run.
     */
    private void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {
            addProduct();  //Add the product
        }
        else if(choice.equals(PRINT_ALL))
        {
            manager.listAllProducts();  //Print all product details
        }
        else if(choice.equals(REMOVE))
        {
            removeProduct();    //Remove the product from list
        }
        else if(choice.equals(DELIVER))
        {
            delivery();     //deliver the products
        }
        else if(choice.equals(SELL))
        {
            sell();     //sell the products
        }
        else if(choice.equals(SEARCH))
        {
            search();       //search products
        }
        else if(choice.equals(LOW_STOCK))
        {
            lowStock();     //print lowstock products
        }
        else if(choice.equals(RE_STOCK))
        {
            reStock();      //restock products which are at a certain amount
        }
    }
    
    /**
     * Add a product using input for id, parse into a string, and then
     * another input for string name, thus making the id and the name for
     * the new product to be made. Lastly print out the product to make sure 
     * it has been created correctly.
     */
    private void addProduct()
    {
        System.out.println("Adding new product\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getString(); //take in input from user to String
        int id = Integer.parseInt(value); //changes String into Int id
        
        System.out.println("Please enter the name of the product");
        String name = input.getString(); //take in input from user to String
        
        Product product = new Product(id, name); //uses Int id and String name 
                                                 //to create new product
                                                 
        manager.addProduct(product); //adds the product just created into an
                                    //arraylist named stock in class manager
        System.out.println();
    }
    
    /**
     * remove product using int id, parse into a String from input id.
     */
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
    
    /**
     * Deliver products using delivery method from manager, inputing quantity 
     * and id
     */
    private void delivery()
    {
        System.out.println("Deliver new products\n");
        
        System.out.println("Please enter the product ID to be delivered");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("please enter the amount to be added by");
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
    
    private void reStock()
    {
        System.out.println("ReStock products");
        
        System.out.println("Enter a number for how many products you want which are lowstock to be restocked by 10");
        String stock = input.getString();
        int number = Integer.parseInt(stock);
        
        manager.topUpWith10(number);
        
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
        System.out.println("    ReStock:    Restock low products");
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
