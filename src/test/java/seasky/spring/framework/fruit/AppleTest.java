package seasky.spring.framework.fruit;



import org.apache.log4j.Logger;
import org.junit.Test;

public class AppleTest {
	Logger LOG = Logger.getLogger(AppleTest.class);
	@Test
	public void test() {
		Apple apple = new Apple("", "", 1.1);
		LOG.info(apple);
		assert apple!=null;
	}

}
