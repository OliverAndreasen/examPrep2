package com.company;
import java.util.Locale;
import java.util.Random;

public class User {

    String fullName;
    String userID;

    public User(String fullName, String userID) {
        this.fullName = fullName;
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    boolean validateUserID(){

        if (userID.length() == 8) {
            String firstFour = userID.substring(0,4);
            String lastFour = userID.substring(4,8);


            char[] firstFourChars = firstFour.toCharArray();

            for (int i = 0; i < firstFourChars.length; i++) {
                if(!Character.isLowerCase((firstFourChars[i]))){
                    return false;
                }
            }

            boolean validateFirstFour = firstFour.matches("[a-zA-Z]+");
            if (validateFirstFour) {
                boolean validateLastFour = lastFour.matches("[0-9]+");
                if(validateLastFour) {
                    return true;
                }
            }
        }
        return false;
    }

    public void createUserID(){
        String result = "";
        String fullNameLower = getFullName().toLowerCase(Locale.ROOT);
        String[] names = fullNameLower.split(" ");
        for (int i = 0; i < names.length; i++) {
            result += names[i].substring(0,2);
        }
        Random rand = new Random();
        int nums = rand.nextInt((9999 - 1000) + 1) + 1000;
        result += nums;
        setUserID(result);
    }
}
