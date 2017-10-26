package cn.yi.ssh;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @Title SSHTest.java
 * @Type SSHTest
 * @Package cn.yi.ssh
 * @Description TODO(采用Spring的注解测试，仅仅支持Spring3.1he以后版本)
 * @author anil
 * @version V1.0
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-*.xml")
public class SSHTest {
	
	@Resource
	private Date date;
	@Test
	public void springIOC() {
		System.out.println(date);

	}

}
