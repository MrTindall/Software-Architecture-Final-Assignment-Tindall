package edu.wctc;
import edu.wctc.CharacterTypes.Archer;
import edu.wctc.CharacterTypes.Mage;
import edu.wctc.CharacterTypes.Paladin;
import edu.wctc.CharacterTypes.Peasant;
import edu.wctc.Model.Classes.Character;
import edu.wctc.Model.Classes.CharacterClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {

    /*
    Cannot add JUnit test for gameplay loop because it requires user Input
    Just Test Character Abilities to see if each move is working as intended
     */

    @Test
    public void testCharacterAbilities() {
        // Create instances of different character types
        Character archer = new Character("Player 1", 100, new Archer());
        Character mage = new Character("Player 2", 100, new Mage());
        Character paladin = new Character("Player 3", 100, new Paladin());
        Character peasant = new Character("Player 4", 100, new Peasant());

        // Test abilities of the characters
        testCharacterAbilities(archer);
        testCharacterAbilities(mage);
        testCharacterAbilities(paladin);
        testCharacterAbilities(peasant);
    }

    // Method to test abilities of a character
    private void testCharacterAbilities(Character character) {
        CharacterClass characterClass = character.getCharacterClass();

        int lightAttackDamage = characterClass.lightAttack.lightAttack();
        int heavyAttackDamage = characterClass.heavyAttack.heavyAttack();


        int initialDamage = 100; // Sample initial damage value
        int defendedDamage = characterClass.defendStrategy.defendStrategy(initialDamage);

        // Assert that abilities return non-negative values
        assertTrue(lightAttackDamage >= 0);
        assertTrue(heavyAttackDamage >= 0);
        assertTrue(defendedDamage >= 0);

    }
}