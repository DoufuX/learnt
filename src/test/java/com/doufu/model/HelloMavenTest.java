package com.doufu.model;

import org.junit.*;
import org.junit.Assert.*;

public class HelloMavenTest{
    @Test
    public void testHello() {
	Assert.assertEquals("Hello Maven",new HelloMaven().Hello());
    }
}
