package com.howtodoinjava.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.howtodoinjava.client.SOAPConfig;
import com.howtodoinjava.client.SOAPConnector;
import com.howtodoinjava.domainobject.Student;
import com.howtodoinjava.domainobject.StudentDetailsRequest;
import com.howtodoinjava.domainobject.StudentDetailsResponse;

@Service
@SuppressWarnings("resource")
public class StudentServiceImpl implements StudentService {
	private static final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

	@Autowired
	StudentRepository studentRepository;
	@Resource
	private ExecutorService executorService;
	
	@Autowired
	private ThreadService threadService;
	
	@Override
	public Student getUsername(StudentDetailsRequest req) {
		Assert.notNull(req.getName(), "The Student's name must not be null");
		logger.info(req.getName() + "-----------StudentServiceImpl----------");

		threadService.createThread(req);
//		executorService.execute(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println(Thread.currentThread().getName() + "スレッドテスト開始");
//				try {
//					TimeUnit.SECONDS.sleep(5);
//				} catch (InterruptedException e) {
//					// TODO 自動生成された catch ブロック
//					e.printStackTrace();
//				}
//
//				// client
//				SOAPConfig config = new SOAPConfig();
//				SOAPConnector soapConnector = config.soapConnector(config.marshaller());
//				String name = "Lokesh";// Default Name
//
//				StudentDetailsRequest request = new StudentDetailsRequest();
//				request.setName(name);
//				response = (StudentDetailsResponse) soapConnector
//						.callWebService("http://localhost:8081/service/student-details", request);
//				System.out.println("Client Got Response As below ========= : ");
//				System.out.println("Client Name : " + response.getStudent().getName());
//				System.out.println("Client Standard : " + response.getStudent().getStandard());
//				System.out.println("Client Address : " + response.getStudent().getAddress());
//				System.out.println(Thread.currentThread().getName() + "スレッドテスト終了");
//			}
//		});
		return studentRepository.findStudent(req);
	}
}
