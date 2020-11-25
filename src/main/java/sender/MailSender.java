package sender;

import message.MailInfo;

public class MailSender {

    public void sendMail(MailInfo info) {
        info.getClient().update(info.getType());
    }
}
