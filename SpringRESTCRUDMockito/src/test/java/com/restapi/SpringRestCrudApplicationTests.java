package com.restapi;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration
public class SpringRestCrudApplicationTests {
	SpringRestCrudApplication srcp = new SpringRestCrudApplication();

	@Test
	public void contextLoads() {
		assertThat(srcp, instanceOf(SpringRestCrudApplication.class));
	}

}
