package mailCodes;

import client.Client;
import com.sendgrid.helpers.mail.objects.Content;

public interface MailCode {
    String header(Client client);
    Content body(Client client);
    String description();
}
