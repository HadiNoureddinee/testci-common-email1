package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;


public class EmailTest {

	private tester email;
	
	
	//called before every run
	@Before
	public void setUpEmailTest() throws Exception{
		email = new tester();
	}
	
	
	//The 10 functions being tested
	
	
	@Test
	public void TestAddBcc() throws Exception {
		email.addBcc("abc@gmail.com");
		assertEquals(1, email.getBccAddresses().size());
	}
	
	@Test
	public void TestAddCc() throws Exception{
		
		email.addCc("dora@gmail.com");
		assertEquals(1, email.getCcAddresses().size());
		
	}
	
	@Test
    public void testAddHeader() throws Exception {
        email.addHeader("cool", "beans");
        assertEquals(email.headers.size(), 1);
    }

    @Test
    public void testAddHeaderHandle() throws Exception {
        try {
            email.addHeader("cool", null);
          
        } catch (IllegalArgumentException e) {
            assertEquals("value can not be null or empty", e.getMessage());
        }
        assertEquals(email.headers.size(), 0);
    }
	

	@Test
	public void TestaddReplyTo() throws Exception{
		
		
		email.addReplyTo("Boots@gmail.com", "Swag");
		assertEquals(1, email.getReplyToAddresses().size());
	
	
	}
	
	@Test
	public void TestsetHostName() throws Exception{
		
		
		email.setHostName("Test Host Name");
		 email.getHostName();
	
	}
	
	@Test
	public void TestsetHostName2() throws Exception{
		
		
		email.setHostName(null);
		email.getHostName();
	
	
	}
	
	@Test
	public void TestsetMailSession() throws Exception{

		email.setHostName("localhost");
		email.setAuthentication("UserName", "Password");
		email.setBounceAddress("COOLbeans@gmail.com");
		email.setSSLOnConnect(true);
		
		
	assertEquals(email.getHostName(),"localhost");
	email.getMailSession();
	
	}
	


	@Test
	public void TestgetSentDate() throws Exception{
		
		
	
		email.setSentDate(null);
		email.getSentDate();
	
	
	}
	
	@Test
	public void TestgetSentDate2() throws Exception{
	

		email.sentDate = new Date();
		email.setSentDate(email.sentDate);
		email.getSentDate();
	
	
	}
	
	@Test
	public void TestsetFrom() throws Exception{
	
		email.setFrom("Sweet@gmail.com");

	}
	
	@Test
	public void TestgetSocketConnectionTimeout() throws Exception{
	
		
	email.setSocketConnectionTimeout(0);
	email.getSocketConnectionTimeout();
		
	
	
	}
	
	//not complete
	@Test
	public void TestbuildMimeMessage() throws Exception{
	
		Properties prop = new Properties();
	
		
		email.setMsg(null);
		email.message = email.getMimeMessage();
		email.getMimeMessage();
	
	
	}
	

}



