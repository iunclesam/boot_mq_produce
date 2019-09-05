package com.atguigu.boot.activemq;

import com.atguigu.boot.activemq.produce.Queue_Produce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainApp_Produce.class)
@WebAppConfiguration
public class MainAppProduceTests {

	@Resource
	private Queue_Produce queue_produce;

	@Test
	public void testSend() {
		queue_produce.produceMsg();
	}

}
