package kata.clash.buildings;

import kata.clash.units.Bomber;
import kata.clash.units.Giant;
import kata.clash.units.Miner;

public class BlueTrainingCamp {
    public static Bomber ProduceBomber()
    {
        return new Bomber();
    }

    public static Giant ProduceGiant()
    {
        return new Giant();
    }

    public static Miner ProduceMiner()
    {
        return new Miner();
    }

}
