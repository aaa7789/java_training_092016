package com.mms.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSampleJunit {

	@Test
	public void test() {
		JunitSample sample = new JunitSample();
		int res = sample.add(5, 4);
		assertEquals(res, 9);
	}

}
