package edu.wctc.CharacterTypes;
import edu.wctc.Model.Classes.CharacterClass;
import edu.wctc.Moves.DefendStrategy.DiveRoll;
import edu.wctc.Moves.HeavyAttack.HardDraw;
import edu.wctc.Moves.LightAttack.QuickShot;


public class Archer extends CharacterClass {

    public Archer(String name) {
        super(name);
        lightAttack = new QuickShot();
        heavyAttack = new HardDraw();
        defendStrategy = new DiveRoll();
    }

}
