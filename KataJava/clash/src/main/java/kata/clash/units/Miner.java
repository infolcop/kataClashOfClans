package kata.clash.units;

import kata.clash.units.hit.Hit;
import kata.clash.units.move.Moving;

public class Miner implements Hit, Moving{
	
	private int DefensiveHitpoints;
	private int OffensiveHitpoints;
	
	public Miner() {
		this.DefensiveHitpoints = 800;
		this.OffensiveHitpoints = 1200;
	}
	
	public int getDefensiveHitpoints() {
		return DefensiveHitpoints;
	}
	
	private void setDefensiveHitpoints(int defensiveHitpoints) {
		DefensiveHitpoints = defensiveHitpoints;
	}
	
	public int getOffensiveHitpoints() {
		return OffensiveHitpoints;
	}
	
	private void setOffensiveHitpoints(int offensiveHitpoints) {
		OffensiveHitpoints = offensiveHitpoints;
	}
	
    public String ReceiveHit(int attackHitpoints)
    {
    	setDefensiveHitpoints(getDefensiveHitpoints() - attackHitpoints);
    	return getDefensiveHitpoints() <= 0 ? UnitsConstants.WE_RETURN_IN_THE_GROUND : "";
    }
    
    public int Move(int seconds)
    {
    	if (seconds == 1)
    		return 5;
          throw new IllegalArgumentException();
    }

	
}
