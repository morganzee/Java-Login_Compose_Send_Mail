
package Login;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class TechnicalAssessment {

    public static void main(String[] args)throws Exception
    {

        Email email = new SimpleEmail(); 
        email.setHostName("smtp.mail.yahoo.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("mnwaiku@yahoo.com", "cnjxzojevfluoutw"));
        email.setSSLOnConnect(true);
        email.setFrom("mnwaiku@yahoo.com");
        email.setSubject("hi");
        email.setMsg("Automation test");
        email.addTo("mnwaiku@yahoo.com");
        email.send();

        System.out.println("Email successfully sent"); //Assertion

    }
}
