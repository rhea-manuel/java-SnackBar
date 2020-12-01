package snackbar;

public class Customer {

    private static int maxId;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cash = cash;
    }

    /*
    ---- GETTERS ----
    */

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getCash()
    {
        return cash;
    }

    /*
    ------ SETTERS -------
    */

    public void setName(String name)
    {
        this.name = name;
    }

    public void addCash(double amt)
    {
        cash+=amt;
    }

    public void buySnacks(double totalCost)
    {
        if (totalCost > cash)
        {
            System.out.println("Not enough money!");
            return;
        }

        if (totalCost ==-0)
        {
            System.out.println("Did not buy anything!");
            return;
        }

        cash-=totalCost;
    }

    @Override
    public String toString()
    {
        return name+" has $"+cash+" on hand.";
    }

}
