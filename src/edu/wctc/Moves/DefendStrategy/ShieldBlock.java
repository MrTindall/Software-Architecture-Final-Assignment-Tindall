package edu.wctc.Moves.DefendStrategy;

import edu.wctc.Model.Interfaces.DefendStrategy;

// Polymorphically sets the move
public class ShieldBlock implements DefendStrategy {
    @Override
    public int defendStrategy(int attack) {
        return (int)Math.round(attack/4.0);
    }
}
