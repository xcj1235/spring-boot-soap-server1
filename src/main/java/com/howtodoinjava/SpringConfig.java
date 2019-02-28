package com.howtodoinjava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

@EnableWs
@Configuration
public class SpringConfig extends WsConfigurerAdapter
{
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext)
    {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/*");
    }

//    @Bean(name = "studentDetailsWsdl")
//    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema)
//    {
//        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
//        wsdl11Definition.setPortTypeName("StudentDetailsPort");
//        wsdl11Definition.setLocationUri("/service/student-details");
//        wsdl11Definition.setTargetNamespace("http://www.howtodoinjava.com/xml/school");
//        wsdl11Definition.setSchema(countriesSchema);
//        return wsdl11Definition;
//    }
    // XSDファイル利用
//    @Bean(name = "studentDetailsWsdl")
//    public Wsdl11Definition getJobAdministrationService() {
//        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
//        wsdl11Definition.setWsdl(new ClassPathResource("school.xsd"));
//        return wsdl11Definition;
//    }
 
    // WSDLファイル利用
    @Bean(name = "studentDetailsWsdl")
    public Wsdl11Definition defaultWsdl11Definition() {
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        wsdl11Definition.setWsdl(new ClassPathResource("studentDetailsWsdl.wsdl"));
        return wsdl11Definition;
    }
//    @Bean
//    public XsdSchema countriesSchema()
//    {
//        return new SimpleXsdSchema(new ClassPathResource("school.xsd"));
//    }
    @Bean
    public ExecutorService getExecutorTools(){
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        return  executorService;
    }
}