package mailCodes;

import com.sendgrid.helpers.mail.objects.Content;
import client.Client;

public class HappyBirthdayGreetingCode extends Content implements MailCode {
//    private static HappyBirthdayGreetingCode cd;

//    public HappyBirthdayGreetingCode() {
//
//    }

    @Override
    public String header(Client client) {
        return "Happy birthday " + client.getName();
    }

    @Override
    public Content body(Client client) {
        return new Content("text/plain", "We wish you all the best");
    }

    @Override
    public String description() {
        return "Happy birthday greeting";
    }

//    public static HappyBirthdayGreetingCode getInstance() {
//        if (cd == null) {
//            cd = new HappyBirthdayGreetingCode();
//        }
//        return cd;
//    }
}
