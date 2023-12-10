package edu.wctc.Moves.DefendStrategy;

import edu.wctc.Model.Interfaces.DefendStrategy;
import java.util.Random;

public class DiveRoll implements DefendStrategy {
    private Random rand = new Random();
    @Override
    public int defendStrategy(int attack) {
        return (rand.nextInt(10) > 5) ? 0:attack;
    }
}
