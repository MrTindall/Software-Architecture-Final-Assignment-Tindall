package edu.wctc.Moves.HeavyAttack;

import edu.wctc.Model.Interfaces.HeavyAttack;

// Polymorphically sets the move
public class HardDraw implements HeavyAttack {
    @Override
    public int heavyAttack() {
        return 20;
    }
}
