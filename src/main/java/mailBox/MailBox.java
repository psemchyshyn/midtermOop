package mailBox;

import com.sendgrid.SendGrid;
import message.MailInfo;
import sender.MailSender;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private static MailBox mailBox;
    private List<MailInfo> infos;
    private MailSender sender;

    private MailBox(String key) {
        infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }

    public void sendAll() {
        for (MailInfo info: infos) {
            sender.sendMail(info);
        }
    }

    public static MailBox createMailBox(String key) {
        if (mailBox == null) {
            mailBox = new MailBox(key);
        }
        return mailBox;
    }

}
