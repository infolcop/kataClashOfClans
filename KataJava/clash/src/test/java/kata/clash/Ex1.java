package kata.clash;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import kata.clash.buildings.BlackElixirFactory;
import kata.clash.exceptions.DwarfsAngryException;
import kata.clash.exceptions.InvalidQuantityException;

public class Ex1 {
	@Test(expected = DwarfsAngryException.class)
	public void When_Gems_Supplied_Are_Not_Enough_Throw_DwarfsAngryException() throws Exception {
		// Given
		Random random = new Random();
		final int gems = random.ints(Integer.MIN_VALUE, 1).findFirst().getAsInt();
		final int blueElixir = 300;

		// When
		BlackElixirFactory.ProduceElixir(gems, blueElixir);
	}

	@Test(expected = DwarfsAngryException.class)
	public void When_BlueElixir_Supplied_Is_Not_Enough_Throw_DwarfsAngryException() throws Exception {
		// Given
		final int gems = 2;
		// Given
		Random random = new Random();
		final int blueElixir = random.ints(Integer.MIN_VALUE, 199).findFirst().getAsInt();

		// When
		BlackElixirFactory.ProduceElixir(gems, blueElixir);
	}

	@Test
	public void With_2_Gems_And_500_BlueElixir_Should_Produce_100_BlackElixir() throws Exception {
		// Given
		final int gems = 2;
		final int blueElixir = 500;

		// When
		final int result = BlackElixirFactory.ProduceElixir(gems, blueElixir);

		// Then
		Assert.assertEquals(100, result);

	}

	@Test
	public void With_4_Gems_And_1000_BlueElixir_Should_Produce_200_BlackElixir() throws Exception {
		// Given
		final int gems = 4;
		final int blueElixir = 1000;

		// When
		final int result = BlackElixirFactory.ProduceElixir(gems, blueElixir);

		// Then
		Assert.assertEquals(200, result);
	}

	@Test
	public void With_5_Gems_And_200_BlueElixir_Should_Produce_100_BlackElixir() throws Exception {
		// Given
		final int gems = 5;
		final int blueElixir = 200;

		// When
		final int result = BlackElixirFactory.ProduceElixir(gems, blueElixir);

		// Then
		Assert.assertEquals(100, result);
	}

	@Test(expected = InvalidQuantityException.class)
	public void When_Gem_Supplied_Is_Too_Much_Throw_InvalidQuantityException() throws Exception {
		// Given
		Random random = new Random();
		final int gems = random.ints(3, Integer.MAX_VALUE).findFirst().getAsInt();

		final int blueElixir = 200;

		// When
		BlackElixirFactory.ProduceElixir(gems, blueElixir);

	}

	@Test(expected = InvalidQuantityException.class)
	public void When_Blue_Elixir_Supplied_Is_Too_Much_Throw_InvalidQuantityException() throws Exception {
		// Given
		final int gems = 2;
		Random random = new Random();
		final int blueElixir = random.ints(201, Integer.MAX_VALUE).findFirst().getAsInt();

		// When
		BlackElixirFactory.ProduceElixir(gems, blueElixir);
	}

}
