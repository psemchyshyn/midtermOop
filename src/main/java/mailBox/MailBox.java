package mailBox;

import mail.MailInfo;
import sender.MailSender;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos;
    private MailSender sender;

    public MailBox(MailSender sender) {
        infos = new ArrayList<>();
        this.sender = sender;
    }

    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }

    public void sendAll() {
        for (MailInfo info: infos) {
            sender.sendMail(info);
        }
    }
}
