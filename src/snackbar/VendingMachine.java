package snackbar;


public class VendingMachine 
{
    private static int maxId;
    private int id;
    private String name;

    public VendingMachine(String name)
    {
        maxId++;

        id = maxId;
        this.name = name;
    }

    /* 
    ----- GETTERS -----
    */
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    /*
    ------ SETTERS ------
    */

    public void setName(String name){
        this.name = name;
    }
    
}
