package edu.wctc.CharacterTypes;

import edu.wctc.Model.Classes.CharacterClass;
import edu.wctc.Moves.DefendStrategy.ShieldBlock;
import edu.wctc.Moves.HeavyAttack.Stab;
import edu.wctc.Moves.LightAttack.Cut;

public class Paladin extends CharacterClass {

    public Paladin(String name) {
        super(name);
        lightAttack = new Cut();
        heavyAttack = new Stab();
        defendStrategy = new ShieldBlock();
    }
}
