package homework6.bottleexercise;

import homework6.personexercise.Person;

public class Bottle {

    private int availableLiquid;
    private int emptyCapacity;
    private int totalCapacity;
    private boolean open;

    public void otherMethod(){
        Person person = new Person("Alex");
        person.publicField = true;
//        person.privateField = false; -- compile error
    }

    public void refill() {

    }
    public boolean hasMoreLiquid(){
        return availableLiquid >0;
    }
    public int getAvailableLiquid(){
        return availableLiquid;
    }

    public int getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }
    public String open(){
        if (open){
            return "Bottle is already opened";
        }
        open = true;
        return "Bottle is opened";
    }
    public String closed(){
        if (!open){
            return "Bottle is already closed";
        }
        open = false;
        return "Bottle is closed";
    }
    public String drink(int liquidToDrink){
        if (!open){
            return "Bottle is not opened";
        }
        if (liquidToDrink> availableLiquid){
            return "Not enogh liqued";
        }
        availableLiquid-= liquidToDrink;
        return liquidToDrink + "has been drank";
    }
}
