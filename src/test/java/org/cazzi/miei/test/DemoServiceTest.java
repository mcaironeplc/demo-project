package org.cazzi.miei.test;

import org.cazzi.miei.service.DemoService;
import org.junit.Test;
import static org.junit.Assert.*;
public class DemoServiceTest {

	
	
	@Test
	public void GetHelloTest() {
		
		DemoService service = new DemoService();
		
		String message = service.getHello();
		
		assertEquals("Hello", message);
	}
}
