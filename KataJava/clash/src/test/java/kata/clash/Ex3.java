package kata.clash;

import org.junit.Assert;
import org.junit.Test;

import kata.clash.units.Bomber;
import kata.clash.units.Dragon;
import kata.clash.units.Giant;
import kata.clash.units.Miner;

public class Ex3 {

	/* Q1 */
	@Test
	public void With_Dragon_Unit_For_1_second_Then_It_Should_Fly_And_Cover_8_Map_Spaces() {
		Dragon dragonUnit = new Dragon();
		int timeForMovementSeconds = 1;
		int expectedCoveredDistance = 8;

		int actualCoveredDistance = dragonUnit.Move(timeForMovementSeconds);

		Assert.assertEquals(expectedCoveredDistance, actualCoveredDistance);
	}

	@Test(expected = IllegalArgumentException.class)
	public void With_Bomber_Unit_For_0_second_Then_It_Should_Throw_Illegal_Argument_Exception() {
		Bomber bomberUnit = new Bomber();
		int timeForMovementSeconds = 0;
		bomberUnit.Move(timeForMovementSeconds);

	}

	@Test(expected = IllegalArgumentException.class)
	public void With_Giant_Unit_For_0_second_Then_It_Should_Throw_Illegal_Argument_Exception() {
		Giant giantUnit = new Giant();
		int timeForMovementSeconds = 0;
		giantUnit.Move(timeForMovementSeconds);

	}

	@Test(expected = IllegalArgumentException.class)
	public void With_Miner_Unit_For_0_second_Then_It_Should_Throw_Illegal_Argument_Exception() {
		Miner minerUnit = new Miner();
		int timeForMovementSeconds = 0;
		minerUnit.Move(timeForMovementSeconds);

	}

	@Test
	public void With_Giant_Unit_For_1_second_Then_It_Should_Walk_And_Cover_3_Map_Spaces() {
		Giant giantUnit = new Giant();
		int timeForMovementSeconds = 1;
		int expectedCoveredDistance = 3;

		int actualCoveredDistance = giantUnit.Move(timeForMovementSeconds);

		Assert.assertEquals(expectedCoveredDistance, actualCoveredDistance);
	}

	@Test
	public void With_Miner_Unit_For_1_second_Then_It_Should_TunnelUnder_And_Cover_5_Map_Spaces() {
		Miner minerUnit = new Miner();
		int timeForMovementSeconds = 1;
		int expectedCoveredDistance = 5;

		int actualCoveredDistance = minerUnit.Move(timeForMovementSeconds);

		Assert.assertEquals(expectedCoveredDistance, actualCoveredDistance);
	}

	/* Q2 */

	@Test
	public void With_Bomber_Unit_For_1_second_Then_It_Should_Run_And_Cover_6_Map_Spaces() {
		Bomber bomberUnit = new Bomber();
		int timeForMovementSeconds = 1;
		int expectedCoveredDistance = 6;

		int actualCoveredDistance = bomberUnit.Move(timeForMovementSeconds);

		Assert.assertEquals(expectedCoveredDistance, actualCoveredDistance);
	}

	@Test
	public void With_Bomber_Unit_For_6_second_Then_It_Should_Run_And_Cover_36_Map_Spaces() {
		Bomber bomberUnit = new Bomber();
		int timeForMovementSeconds = 6;
		int expectedCoveredDistance = 36;

		int actualCoveredDistance = bomberUnit.Move(timeForMovementSeconds);

		Assert.assertEquals(expectedCoveredDistance, actualCoveredDistance);
	}

}
