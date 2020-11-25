// using SendGrid's Java Library
// https://github.com/sendgrid/sendgrid-java
import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Email from = new Email("pavlosemchyshyn@gmail.com");
        String subject = "Sending with SendGrid is Fun";
        Email to = new Email("pavlosemchyshyn@gmail.com");
        Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid("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\n");
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        } catch (IOException ex) {
            throw ex;
        }
    }
}