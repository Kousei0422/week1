package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = inputName.nextLine();
        Scanner inputAge = new Scanner(System.in);
        System.out.println("Ok, " + name + "!  How old are you?");
        int age = inputAge.nextInt();
        if (age < 16) {
            System.out.println("You can't drive.");
        } else if (age == 16 || age == 17) {
            System.out.println("You can drive but not vote.");
        } else if (age >= 18 && age <= 24){
            System.out.println("You can vote but not rent a car.");
        } else{
            System.out.println("You can do pretty much anything.");
        }
    }
}
