package kata.clash.buildings;

import kata.clash.units.Dragon;
import kata.clash.units.UnitType;

public class BlackTrainingCamp {
	public static Dragon ProduceUnit(UnitType unitType)
    {
        if (unitType == UnitType.DRAGON)
        	
            return new Dragon();

        throw new UnsupportedOperationException();
    }
}
