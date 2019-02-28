package howtodoinjava.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.howtodoinjava.service.StudentServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=StudentServiceImpl.class)
public class test111 {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@@AfterClass");
	}
	
	@Before
	public void testBefore() {
		System.out.println("Before");
	}
	@After
	public void testAfter() {
		System.out.println("After");		
	}
	@Test
	public void testTest1() {
		System.out.println("Test1");		
	}
	@Test
	public void testTest2() {
		System.out.println("Test2");		
	}

}
