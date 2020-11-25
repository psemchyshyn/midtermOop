// using SendGrid's Java Library
// https://github.com/sendgrid/sendgrid-java

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import mail.MailInfo;
import mailBox.MailBox;
import mailCodes.HappyBirthdayGreetingCode;
import sender.MailSender;
import client.Client;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Client cl = new Client("oleg", 40, "male", "dan.socialgram@gmail.com");
        MailBox box = new MailBox(new MailSender(new SendGrid("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\n")));
        box.addMailInfo(new MailInfo(cl, new HappyBirthdayGreetingCode()));
        box.sendAll();
    }
}