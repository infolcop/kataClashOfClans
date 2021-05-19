package kata.clash.units;

import kata.clash.units.hit.Hit;

public class Dragon implements Hit{
	
	private int DefensiveHitpoints;
	private int OffensiveHitpoints;

	public Dragon() {
		this.DefensiveHitpoints = 5000;
		this.OffensiveHitpoints = 7500;
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
    	return getDefensiveHitpoints() <= 0 ? UnitsConstants.I_WILL_RISE_AGAIN_FROM_THE_ASHES : ""; 
    }
    
   public int Move(int seconds) 
    {
	   if (seconds >= 1)
   		return 8 * seconds;
      throw new IllegalArgumentException();
    }

	
}
