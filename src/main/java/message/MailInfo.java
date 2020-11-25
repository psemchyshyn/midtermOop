package message;

import client.Client;
import lombok.Getter;


@Getter
public class MailInfo {
    private Client client;
    private String type;

    public MailInfo(Client client,  String type) {
        this.client = client;
        this.type = type;
    }
}
