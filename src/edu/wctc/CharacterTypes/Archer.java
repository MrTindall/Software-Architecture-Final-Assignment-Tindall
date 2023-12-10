package edu.wctc.CharacterTypes;

import edu.wctc.Model.Classes.CharacterClass;
import edu.wctc.Model.Interfaces.HeavyAttack;
import edu.wctc.Model.Interfaces.LightAttack;
import edu.wctc.Moves.DefendStrategy.DiveRoll;
import edu.wctc.Moves.DefendStrategy.Staffblock;
import edu.wctc.Moves.HeavyAttack.Fireball;
import edu.wctc.Moves.HeavyAttack.HardDraw;
import edu.wctc.Moves.LightAttack.QuickShot;
import edu.wctc.Moves.LightAttack.Shock;
import jdk.swing.interop.LightweightFrameWrapper;

public class Archer extends CharacterClass {

    public Archer() {
        super();
        lightAttack = new QuickShot();
        heavyAttack = new HardDraw();
        defendStrategy = new DiveRoll();
    }

}
