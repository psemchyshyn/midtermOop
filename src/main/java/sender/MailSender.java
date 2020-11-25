package sender;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import mail.MailInfo;

import java.io.IOException;

public class MailSender {
    private SendGrid sender;

    public MailSender(SendGrid sender) {
        this.sender = sender;
    }

    public void sendMail(MailInfo info) {
        try {
            Response response = sender.api(buildRequest(info));
            info.getClient().update(response);
        } catch (IOException e) {
            System.out.println("Couldn't send mail to " + info.getClient().getEmail() +
                    " to notify " + info.getMailCode().description());
        }
    }

    public Request buildRequest(MailInfo mail) throws IOException{
        Request request = new Request();
        request.setMethod(Method.POST);
        request.setEndpoint("mail/send");
        request.setBody(mail.build());
        return request;
    }
}
