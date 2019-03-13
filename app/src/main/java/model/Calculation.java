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
    public static float percentageApple;
    public static int totalOrange;
    public static float percentageOrange;
    public static int totalMixed;
    public static float percentageMixed;
    public static int totalCoca;
    public static float percentageCoca;
    public static int totalSprite;
    public static float percentageSprite;
    public static int totalSevenUP;
    public static float percentageSevenUP;
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

    public float getPercentageApple() {
        return percentageApple;
    }

    public int getTotalOrange() {
        return totalOrange;
    }

    public float getPercentageOrange() {
        return percentageOrange;
    }

    public int getTotalMixed() {
        return totalMixed;
    }

    public float getPercentageMixed() {
        return percentageMixed;
    }

    public int getTotalCoca() {
        return totalCoca;
    }

    public float getPercentageCoca() {
        return percentageCoca;
    }

    public int getTotalSprite() {
        return totalSprite;
    }

    public float getPercentageSprite() {
        return percentageSprite;
    }

    public int getTotalSevenUP() {
        return totalSevenUP;
    }

    public float getPercentageSevenUP() {
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

            percentageApple = ((float) totalApple /(float) totalCups) * (float) 100;
            percentageOrange = ((float) totalOrange / (float) totalCups) * (float) 100;
            percentageMixed = ((float) totalMixed / (float) totalCups) * (float) 100;
            percentageCoca = ((float) totalCoca / (float) totalCups) * (float) 100;
            percentageSprite = ((float) totalSprite / (float) totalCups) * (float) 100;
            percentageSevenUP = ((float) totalSevenUP / (float) totalCups) * (float) 100;
        }

    }

