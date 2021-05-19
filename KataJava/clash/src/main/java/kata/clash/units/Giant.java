package kata.clash.units;

import kata.clash.units.hit.Hit;

public class Giant implements Hit{
	
	private int DefensiveHitpoints;
	private int OffensiveHitpoints;
	
	public Giant() {
		this.DefensiveHitpoints = 4500;
		this.OffensiveHitpoints = 3000;
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
    	return getDefensiveHitpoints() <= 0 ? UnitsConstants.OUR_IRON_FISTS_WILL_BE_REMEMBERED_FOREVER : ""; 
    }
    
    public int Move(int seconds)
    {
	   if (seconds >= 1)
   		return 3 * seconds;
      throw new IllegalArgumentException();
    }

	
}
