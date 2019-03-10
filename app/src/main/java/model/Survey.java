package model;

import java.io.Serializable;

public class Survey implements Serializable {


    private String clientNumber;
    private String drinkType;
    private String drink;
    private static int numCups;

    public Survey(String clientNumber, String drinkType, String drink, int numCups) {
        this.clientNumber = clientNumber;
        this.drinkType = drinkType;
        this.drink = drink;
        this.numCups += numCups;
    }


    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
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
