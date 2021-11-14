package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /* Opgave 1
        BMI bmi = new BMI(1.75,50);
        System.out.println(bmi.calculate());
        System.out.println("Underweight: " + bmi.isUnderWeight());
        System.out.println("Overweight: " + bmi.isOverWeight());
        System.out.println("Normal weight: " + bmi.isNormalWeight());
       */

        /* Opgave 2
        Article article = new Article("Headline", "jeg jeg jeg er en word word word list med flere flere flere ord der der er de de samme", "Loliver");
        System.out.println(article.getLongestWord());

        for (int i = 0; i < article.getWords().size(); i++) {

            System.out.println(article.getWords().get(i));
        }

         */


        /* Opgave 3 */
        User user = new User("Oliver Andreasen", "oliv2058");

        System.out.println(user.validateUserID());

        System.out.println(user.getUserID());
        user.createUserID();
        System.out.println(user.getUserID());
    }
}
