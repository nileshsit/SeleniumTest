package Maventest;
	
	import org.apache.commons.mail.DefaultAuthenticator;
	import org.apache.commons.mail.Email;
	import org.apache.commons.mail.EmailException;
	import org.apache.commons.mail.SimpleEmail;

	public class SendReportEmail {

		public static void sendEmail() throws EmailException {
			System.out.println("========== Send Email Process Started =============");
			
			Email email = new SimpleEmail();
			email.setHostName("smtp.shaligraminfotech.com");
			email.setSmtpPort(465);

			
			
			email.setAuthenticator(new DefaultAuthenticator("nilesh.p@shaligraminfotech.com", "sit@123456"));
			email.setSSLOnConnect(true);
			email.setFrom("nilesh.p@shaligraminfotech.com");
			email.setSubject("Automation Testing Report");
			email.setMsg("Plese Find Automation Test Result : " + "file:///D://NILESH%20SELENIUM//EXTENTREPORT_OUTPUT//myccVerifyTitle.html");
			
			email.addTo("nilesh.p@shaligraminfotech.com");
			email.send();
			
			System.out.println("========== Sent Email Successfully =============");
		
/*
			
            System.out.println("========== Send Email Process Started =============");
			
			Email email = new SimpleEmail();
			
			email.setHostName("smtp.mailgun.org");
			email.setSmtpPort(2525);

			
			
			email.setAuthenticator(new DefaultAuthenticator("postmaster@myclasscampus.com", "e1c93cdd8835d603864b1df40ec4f33c"));
			email.setSSLOnConnect(true);
			email.setFrom("postmaster@myclasscampus.com");
			email.setSubject("Automation Testing Report");
			email.setMsg("Please Find Automation Test Result : " + "file:///D:/server_automation/myCCVerifyTitle.html");
			//email.setMsg("Please Find Automation Test Result : " + "file:////var/log/apache2/myCCVerifyTitle.html");
			
			email.addTo("nilesh.p@shaligraminfotech.com");
			email.addTo("rutvij@careerkhojj.com");
			email.send();
			
			System.out.println("========== Sent Email Successfully =============");

	*/		
		}

	}
