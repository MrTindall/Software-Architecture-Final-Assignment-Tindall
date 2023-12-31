package edu.wctc.CharacterTypes;

import edu.wctc.Model.Classes.CharacterClass;
import edu.wctc.Moves.DefendStrategy.ArmBlock;
import edu.wctc.Moves.HeavyAttack.Kick;
import edu.wctc.Moves.LightAttack.Punch;

public class Peasant extends CharacterClass {

    // Peasant Class
    public Peasant() {
        this.name = "Peasant";
        lightAttack = new Punch();
        heavyAttack = new Kick();
        defendStrategy = new ArmBlock();
    }
}
