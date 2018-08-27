package com.gms.web.exam;

import static org.junit.Assert.*;

import org.junit.Test;

public class MariadbConnTest {

	@Test
	public void test() {
		MariadbConn m = new MariadbConn();
		System.out.println(m.exam());
		assertEquals("Y1", m.exam());
		
	}

}
