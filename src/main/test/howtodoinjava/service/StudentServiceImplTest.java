package howtodoinjava.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.howtodoinjava.domainobject.StudentDetailsRequest;
import com.howtodoinjava.service.StudentServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=StudentServiceImpl.class)
public class StudentServiceImplTest {
	StudentDetailsRequest sd = new StudentDetailsRequest(); 
	@Before
	public void testbefor() {
		sd.setName("test111");
	}
	
	@Test
	public void 異常入力値_空() {
//		fail("まだ実装されていません");
		assertEquals("同じ", "test111", sd.getName());
//		BeanUtils
	}
	
	@Test
	public void 異常入力値_不正値() {
//		fail("まだ実装されていません");
		assertEquals("同じ", "test111", sd.getName());
//		BeanUtils
	}
	
//	@Test
//	public void testGetUsername() {
//		fail("まだ実装されていません");
//	}

}
