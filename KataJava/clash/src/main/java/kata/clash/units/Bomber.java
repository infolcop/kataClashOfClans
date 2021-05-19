package kata.clash.units;

import kata.clash.units.hit.Hit;

public class Bomber implements Hit{
	
	private int DefensiveHitpoints;
	private int OffensiveHitpoints;
	
	public Bomber() {
		this.DefensiveHitpoints = 350;
		this.OffensiveHitpoints = 800;
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
    	return getDefensiveHitpoints() <= 0 ? UnitsConstants.WHEN_YOU_PLAY_WITH_EXPLOSIVES_IS_DANGEROUS_BUSSINESS : ""; 
    }
    
    public int Move(int seconds)
    {
    	if (seconds >= 1)
    		return 6 * seconds;
          throw new IllegalArgumentException();
    }

	
}
