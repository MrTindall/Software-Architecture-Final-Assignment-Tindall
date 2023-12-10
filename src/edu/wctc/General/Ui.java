package edu.wctc.General;

import edu.wctc.CharacterTypes.Archer;
import edu.wctc.CharacterTypes.Mage;
import edu.wctc.CharacterTypes.Paladin;
import edu.wctc.CharacterTypes.Peasant;
import edu.wctc.Model.Classes.CharacterClass;
import edu.wctc.Model.Interfaces.Moves;

import java.util.Scanner;

public class Ui {

    Scanner keyboard = new Scanner(System.in);

    public String getName() {
        System.out.print("Please enter Player's Name: ");
        return keyboard.nextLine();
    }

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

    public String getMove() {
        System.out.println("Available actions:");
        System.out.println("1 = lightAttack");
        System.out.println("2 = heavyAttack");
        System.out.println("3 = defendStrategy");

        char answer = keyboard.nextLine().charAt(0);
        while(true){
            if (answer == '1') {
                return "1";
            }
            else if (answer == '2') {
                return "2";
            }
            else if (answer == '3') {
                return "3";
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }

}
