package client;

import message.MailInfo;

public class Client implements Subject {
    private int id = 0;
    private String name;
    private int age;
    private String sex;

    public Client(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void update(String message) {
        System.out.println("Message is sent!("  + message + ")");
    }
}
