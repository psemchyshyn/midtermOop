package mailCodes;

import com.sendgrid.helpers.mail.objects.Content;
import client.Client;

public class HappyBirthdayGreetingCode extends Content implements MailCode {
    @Override
    public String header(Client client) {
        return "Happy birthday";
    }

    @Override
    public Content body(Client client) {
        return new Content("text/plain", "We wish you all the best");
    }

    @Override
    public String description() {
        return "Happy birthday greeting";
    }
}
