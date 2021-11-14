package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /* Opgave 1  */
        System.out.println("Opgave 1");
        BMI bmi = new BMI(1.75,50);
        System.out.println("BMI: " + bmi.calculate());
        System.out.println("Underweight: " + bmi.isUnderWeight());
        System.out.println("Overweight: " + bmi.isOverWeight());
        System.out.println("Normal weight: " + bmi.isNormalWeight());
        System.out.println();


        /* Opgave 2 */
        System.out.println("Opgave 2");
        Article article = new Article("Headline", "jeg jeg jeg er en word word word list med flere flere flere ord der der er de de samme", "Loliver");
        System.out.println("First instance of longest word: " + article.getLongestWord());
        System.out.println("Unique words in article body: " + article.getUniqueWordsToString());
        System.out.println();



        /* Opgave 3 */
        System.out.println("Opgave 3");
        User user = new User("Oliver Andreasen");
        System.out.println("User id before creation: " + user.getUserID());
        System.out.println("User id validation: " + user.validateUserID());

        user.createUserID();
        System.out.println("User id after creation: " + user.getUserID());
        System.out.println("User id validation: " + user.validateUserID());
    }
}
