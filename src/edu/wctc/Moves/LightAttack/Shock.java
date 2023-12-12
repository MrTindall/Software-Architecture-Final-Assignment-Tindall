package edu.wctc.Moves.LightAttack;

import edu.wctc.Model.Interfaces.LightAttack;

// Polymorphically sets the move
public class Shock implements LightAttack {

    @Override
    public int lightAttack() {
        return 5;
    }
}
