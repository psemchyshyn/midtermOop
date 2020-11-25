package mailCodes;

import client.Client;
import com.sendgrid.helpers.mail.objects.Content;

public class NewYearGreetingCode implements MailCode {
    @Override
    public String header(Client client) {
        return "Happy New Year";
    }

    @Override
    public Content body(Client client) {
        return new Content("text/plain", "Let the new Year be better");
    }

    @Override
    public String description() {
        return "New Year Greeting";
    }
}
