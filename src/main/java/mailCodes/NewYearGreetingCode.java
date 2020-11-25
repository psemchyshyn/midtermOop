package mailCodes;

import client.Client;
import com.sendgrid.helpers.mail.objects.Content;

// Singleton
public class NewYearGreetingCode extends Content implements MailCode {
    private static NewYearGreetingCode cd;

    private NewYearGreetingCode() {

    }
    @Override
    public String header(Client client) {
        return "Happy New Year " + client.getName();
    }

    @Override
    public Content body(Client client) {
        return new Content("text/plain", "Let the new Year be better");
    }

    @Override
    public String description() {
        return "New Year Greeting";
    }

    public static NewYearGreetingCode getInstance() {
        if (cd == null) {
            cd = new NewYearGreetingCode();
        }
        return cd;
    }
}
