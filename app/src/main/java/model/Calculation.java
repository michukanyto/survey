package model;

import java.util.ArrayList;

public class Calculation {
    public enum Drink{
        Apple,
        Orange,
        Mixed,
        Coca,
        Sprite,
        SevenUp,
        APPLE;
    }

    ArrayList<Survey> data;
    private int totalCups;
    private int totalApple;
    private int percentageApple;
    private int totalOrange;
    private int percentageOrange;
    private int totalMixed;
    private int percentageMixed;
    private int totalCoca;
    private int percentageCoca;
    private int totalSprite;
    private int percentageSprite;
    private int totalSevenUP;
    private int percentageSevenUP;

    public Calculation(ArrayList<Survey> data) {
        this.data = data;
    }

    public int getTotalCups() {
        return totalCups;
    }

    public int getTotalApple() {
        return totalApple;
    }

    public int getPercentageApple() {
        return percentageApple;
    }

    public int getTotalOrange() {
        return totalOrange;
    }

    public int getPercentageOrange() {
        return percentageOrange;
    }

    public int getTotalMixed() {
        return totalMixed;
    }

    public int getPercentageMixed() {
        return percentageMixed;
    }

    public int getTotalCoca() {
        return totalCoca;
    }

    public int getPercentageCoca() {
        return percentageCoca;
    }

    public int getTotalSprite() {
        return totalSprite;
    }

    public int getPercentageSprite() {
        return percentageSprite;
    }

    public int getTotalSevenUP() {
        return totalSevenUP;
    }

    public int getPercentageSevenUP() {
        return percentageSevenUP;
    }


    public void calculate(){
        for (Survey i : data){
            switch (i.getDrink()){
                case "Apple":
                    totalApple += i.getNumCups();
                    break;
                case "Orange":
                    totalOrange += i.getNumCups();
                    break;
                case "Mixed":
                    totalMixed += i.getNumCups();
                    break;
                case "Coca":
                    totalCoca += i.getNumCups();
                    break;
                case "Sprite":
                    totalSprite += i.getNumCups();
                    break;
                case "SevenUp":
                    totalSevenUP += i.getNumCups();
                    break;
                default:
                    break;

            }
            percentageApple = (totalApple / totalCups) * 100;
            percentageOrange = (totalOrange / totalCups) * 100;
            percentageMixed = (totalMixed / totalCups) * 100;
            percentageCoca = (totalCoca / totalCups) * 100;
            percentageSprite = (totalSprite / totalCups) * 100;
            percentageSevenUP = (totalSevenUP / totalCups) * 100;
        }

    }
}
