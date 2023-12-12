package edu.wctc.General;

import edu.wctc.CharacterTypes.Archer;
import edu.wctc.CharacterTypes.Mage;
import edu.wctc.CharacterTypes.Paladin;
import edu.wctc.CharacterTypes.Peasant;
import edu.wctc.Model.Classes.CharacterClass;

import java.util.Scanner;

public class Ui {

    Scanner keyboard = new Scanner(System.in);

    // Get name from user for the characters
    public String getName() {
        System.out.print("Please enter Player's Name: ");
        return keyboard.nextLine();
    }

    // Get character class from user input
    public CharacterClass getCharacterClass() {
            System.out.println("Available actions:");
            System.out.println("1 = Archer");
            System.out.println("2 = Mage");
            System.out.println("3 = Paladin");
            System.out.println("4 = Peasant");
            System.out.println("If Invalid or Null = Peasant");


            String answer = keyboard.nextLine();
            switch (answer) {
                case "1": return new Archer();
                case "2": return new Mage();
                case "3": return new Paladin();
                case "4": return new Peasant();
            }
            return new Peasant();
    }

    // Get user input for move selection
    public String getMove() {

        while(true){
            System.out.println("Available actions:");
            System.out.println("1 = lightAttack");
            System.out.println("2 = heavyAttack (Skip Next Turn");
            System.out.println("3 = defendStrategy");

            String answer = keyboard.nextLine();

            if (answer.equals("1")) {
                return "1";
            }
            else if (answer.equals("2")) {
                return "2";
            }
            else if (answer.equals("3")) {
                return "3";
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }

}
