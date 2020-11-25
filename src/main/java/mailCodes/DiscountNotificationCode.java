package mailCodes;

import client.Client;
import com.sendgrid.helpers.mail.objects.Content;

public class DiscountNotificationCode implements MailCode {
    @Override
    public String header(Client client) {
        return "New Discount available for " + client.getName();
    }

    @Override
    public Content body(Client client) {
        return new Content("text/plain", "Check our store to buy products cheaper");
    }

    @Override
    public String description() {
        return "Discount greeting";
    }
}
