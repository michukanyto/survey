package model;

import com.appsmontreal.survey.MainActivity;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Calculation {
//    private final String APPLE = "Apple";
//    private final String ORANGE = "Orange";
//    private final String MIXED = "Mixed";
//    private final String COCA = "Coca";
//    private final String SPRITE = "Sprite";
//    private final String SEVENUP = "SevenUp";


    ArrayList<Survey> data;
    public static int totalCups;
    public static int totalApple;
    public static double percentageApple;
    public static int totalOrange;
    public static double percentageOrange;
    public static int totalMixed;
    public static double percentageMixed;
    public static int totalCoca;
    public static double percentageCoca;
    public static int totalSprite;
    public static double percentageSprite;
    public static int totalSevenUP;
    public static double percentageSevenUP;
    DecimalFormat df = new DecimalFormat("#.0");

//    public Calculation(ArrayList<Survey> data) {
//        this.data = data;
//    }

    public int getTotalCups() {
        return totalCups;
    }

    public int getTotalApple() {
        return totalApple;
    }

    public double getPercentageApple() {
        return percentageApple;
    }

    public int getTotalOrange() {
        return totalOrange;
    }

    public double getPercentageOrange() {
        return percentageOrange;
    }

    public int getTotalMixed() {
        return totalMixed;
    }

    public double getPercentageMixed() {
        return percentageMixed;
    }

    public int getTotalCoca() {
        return totalCoca;
    }

    public double getPercentageCoca() {
        return percentageCoca;
    }

    public int getTotalSprite() {
        return totalSprite;
    }

    public double getPercentageSprite() {
        return percentageSprite;
    }

    public int getTotalSevenUP() {
        return totalSevenUP;
    }

    public double getPercentageSevenUP() {
        return percentageSevenUP;
    }


    public void setTotalCups(int totalCups) {
        this.totalCups += totalCups;
    }

    public void setTotalApple(int totalApple) {
        this.totalApple = totalApple;
    }

    public void setTotalOrange(int totalOrange) {
        this.totalOrange = totalOrange;
    }

    public void setTotalMixed(int totalMixed) {
        this.totalMixed = totalMixed;
    }

    public void setTotalCoca(int totalCoca) {
        this.totalCoca = totalCoca;
    }

    public void setTotalSprite(int totalSprite) {
        this.totalSprite = totalSprite;
    }

    public void setTotalSevenUP(int totalSevenUP) {
        this.totalSevenUP = totalSevenUP;
    }

    public void calculate(){

            percentageApple = ((double) totalApple /(double) totalCups) * (double) 100;
            percentageOrange = ((double) totalOrange / (double) totalCups) * (double) 100;
            percentageMixed = ((double) totalMixed / (double) totalCups) * (double) 100;
            percentageCoca = ((double) totalCoca / (double) totalCups) * (double) 100;
            percentageSprite = ((double) totalSprite / (double) totalCups) * (double) 100;
            percentageSevenUP = ((double) totalSevenUP / (double) totalCups) * (double) 100;
        }

    }

