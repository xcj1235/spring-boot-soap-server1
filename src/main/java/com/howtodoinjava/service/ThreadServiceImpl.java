package com.howtodoinjava.service;

import java.util.concurrent.ExecutorService;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.client.SOAPConfig;
import com.howtodoinjava.client.SOAPConnector;
import com.howtodoinjava.domainobject.StudentDetailsRequest;
import com.howtodoinjava.domainobject.StudentDetailsResponse;

@Service
public class ThreadServiceImpl implements ThreadService{

	@Resource
	@Autowired
	private ExecutorService executorService;

	public void createThread(StudentDetailsRequest req) {
		executorService.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "スレッドテスト開始");
				// client
				SOAPConfig config = new SOAPConfig();
				SOAPConnector soapConnector = config.soapConnector(config.marshaller());
//				String name = "Lokesh";// Default Name

				String name = req.getName();
				
				StudentDetailsRequest request = new StudentDetailsRequest();
				request.setName(name);
				StudentDetailsResponse response = (StudentDetailsResponse) soapConnector
						.callWebService("http://localhost:8081/service/student-details", request);
				System.out.println("Client Got Response As below ========= : ");
				System.out.println("Client Name : " + response.getStudent().getName());
				System.out.println("Client Standard : " + response.getStudent().getStandard());
				System.out.println("Client Address : " + response.getStudent().getAddress());
				System.out.println(Thread.currentThread().getName() + "スレッドテスト終了");
			}
		});
	}
}
