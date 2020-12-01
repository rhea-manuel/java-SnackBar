package snackbar;

public class Snackbar 
{
    public static void main(String[] args) 
    {

        // String name, int quantity, double cost, int vendingMachineId
        // Snack hotdog = new Snack("Hotdog", 5,  9.99, 0);
        // System.out.println(hotdog.getName());
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // String name, int quantity, double cost, int vendingMachineId
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2, food.getId());

        Snack soda = new Snack("Soda", 24, 2.5, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        jane.buySnacks(soda.buy(3));
        System.out.println(jane+"\r\n"+soda);
        
        jane.buySnacks(pretzel.buy(1));
        System.out.println(jane+"\r\n"+pretzel);
        
        bob.buySnacks(soda.buy(2));
        System.out.println(bob+"\r\n"+soda);
        
        jane.addCash(10);
        System.out.println(jane);
        
        jane.buySnacks(chocolateBar.buy(1));
        System.out.println(jane+"\r\n"+chocolateBar);
        
        pretzel.addItems(12);
        System.out.println(pretzel);
        
        bob.buySnacks(pretzel.buy(3));
        System.out.println(bob+"\r\n"+pretzel);
    }
    
}
