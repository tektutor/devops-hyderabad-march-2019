package org.tektutor;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloTest {

	@Test
	public void testSayHello() {

		Hello hello = new Hello();

		String actualResponse = hello.sayHello();
		String expectedResponse = "Hello DevOps!";

		assertEquals ( expectedResponse, actualResponse );

	}

}
