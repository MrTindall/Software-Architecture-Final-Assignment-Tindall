package edu.wctc.Moves.DefendStrategy;

import edu.wctc.Model.Interfaces.DefendStrategy;

public class Staffblock implements DefendStrategy {
    @Override
    public int defendStrategy(int attack) {
        return (int)Math.round(attack/2.0);
    }
}
