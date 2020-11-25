package mailCodes;

import client.Client;
import com.sendgrid.helpers.mail.objects.Content;
import lombok.Singular;


// Singleton
public class DiscountNotificationCode extends Content implements MailCode {
    private static DiscountNotificationCode cd;

    private DiscountNotificationCode() {

    }

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


    public static DiscountNotificationCode getInstance() {
        if (cd == null) {
            cd = new DiscountNotificationCode();
        }
        return cd;
    }
}
