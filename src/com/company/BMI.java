package com.company;

public class BMI {
    private double height;
    private double weight;

    public BMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double calculate() {
        double result =(weight/Math.pow(height,2));

        return Math.round(result*10.0)/10.0;
    }

    public boolean isUnderWeight() {
        if (calculate() < 18.5) {
            return true;
        }
        return false;
    }

    public boolean isOverWeight() {
        if (calculate() > 25) {
            return true;
        }
        return false;
    }

    public boolean isNormalWeight() {
        if (calculate() >= 18.5 && calculate() <= 25.0 ) {
            return true;
        }
        return false;
    }

}
