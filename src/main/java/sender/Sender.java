package sender;

import message.MailInfo;

public class Sender {

    public void sendMail(MailInfo info) {
        info.getClient().update(info.getType());
    }
}
