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
 * @Description TODO(����Spring��ע����ԣ�����֧��Spring3.1he�Ժ�汾)
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
