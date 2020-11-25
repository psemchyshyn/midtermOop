package mail;

import client.Client;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Email;
import lombok.Getter;
import mailCodes.MailCode;


@Getter
public class MailInfo extends Mail {
    private static final Email from = new Email("pavlosemchyshyn@gmail.com");
    private Client client;
    // Uses strategy pattern for implementing different types of mails
    private MailCode mailCode;

    public MailInfo(Client client,  MailCode mailCode) {
        super(from, mailCode.header(client), new Email(client.getEmail()), mailCode.body(client));
        this.client = client;
        this.mailCode = mailCode;
    }
}
