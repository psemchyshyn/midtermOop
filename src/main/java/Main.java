

import mail.MailInfo;
import mailBox.MailBox;
import mailCodes.HappyBirthdayGreetingCode;
import sender.MailSender;
import client.Client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // in api_key.txt
        String key = getKey();


        Client cl = new Client("oleg", 40, "male", "pavlosemchyshyn@gmail.com");
        MailBox box = new MailBox(new MailSender(key));
        box.addMailInfo(new MailInfo(cl, new HappyBirthdayGreetingCode()));
        box.sendAll();
    }

    public static String getKey() {
        try {
            Scanner myReader = new Scanner(new File("src/main/java/api_key.txt"));
            String data = myReader.nextLine();
            myReader.close();
            return data;
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't read file");
            e.printStackTrace();
        }
        return "";
    }
}