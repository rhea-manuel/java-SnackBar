package snackbar;

public class Snack 
{
    private static int maxId = 0;

    private int id;
    
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) 
    {
        maxId++;
        
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    /*
    ------ GETTERS -------
    */

    // GETTER: Returns id
    public int getId() 
    {
        return id;
    }

    // GETTER: Returns name
    public String getName ()
    {
        return name;
    }

    // GETTER: Returns cost
    public double getCost ()
    {
        return cost;
    }

    // GETTER: Returns Vending Machine Id
    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    /*
    ------ SETTERS -------
    */
	
	// SETTER: Sets name of snack
    public void setName(String name)
    {
        this.name = name;
		
    }
	
	// SETTER: Sets cost of snack
    public void setCost(double cost)
    {
        this.cost = cost;
    }
	
	//SETTER: Sets vending machine id
	public void setVendingMachineId (int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}
	
	/*
	------- METHODS --------
	*/
    
    // Adds number to quantity
	public void addItems (int toAdd)
	{
        quantity+=toAdd;
	}
	
    // Removes items from quantity, and returns the amount of money spent
	public double buy(int quantity)
	{
        // If the amount wanted to buy is greater than amount in machine, prints an error message and does not buy anything.
        if (this.quantity < quantity)
		{
            System.out.println("Not enough snacks!");
            return(0);
		}
		
		this.quantity-=quantity;
        return getTotalCost(quantity);
    }
    
    // Returns total cost based on amount wanted to buy
    public double getTotalCost(int amount)
    {
        return amount*cost;
    }

    @Override
    public String toString()
    {
        return "Quantity of "+name+" is "+quantity;
    }

}