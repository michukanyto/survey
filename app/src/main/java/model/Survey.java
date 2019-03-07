package model;

public class Survey {

//    public enum Drink{
//        JUICE,
//        LIMONADE;
//    }

    private int clientNumber;
    private String drinkType;
    private String drink;
    private int numCups;

    public Survey(int clientNumber, String drinkType, String drink, int numCups) {
        this.clientNumber = clientNumber;
        this.drinkType = drinkType;
        this.drink = drink;
        this.numCups = numCups;
    }


    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public int getNumCups() {
        return numCups;
    }

    public void setNumCups(int numCups) {
        this.numCups = numCups;
    }


}
