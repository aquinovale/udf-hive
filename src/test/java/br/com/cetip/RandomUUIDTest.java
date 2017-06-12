package br.com.cetip;

import org.junit.Assert;
import org.junit.Test;

public class RandomUUIDTest {

	@Test
	public void testEvaluate() {

		RandomUUID uuid = new RandomUUID();
		Assert.assertEquals(36, uuid.evaluate().toString().length());

	}
}

