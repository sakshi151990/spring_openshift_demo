package com.spring_openshift_demo.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.spring_openshift_demo.demo.web.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringOpenshiftDemoApplicationTests {

	@Test
	public void Indexpage() throws Exception {

		com.spring_openshift_demo.demo.web.HomeController controller = new HomeController();
		new MockMvcBuilder() {
			
			@Override
			public MockMvc build() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		MockMvc mockmvc = MockMvcBuilders.standaloneSetup(controller).build();
		mockmvc.perform(post("/")).andExpect(view().name("welcome"));

	}
}
