package client;

import com.sendgrid.Response;
import lombok.Getter;

@Getter
public class Client implements Subject{
    private static int ID_POINTER = 0;
    private int id;
    private String name;
    private int age;
    private String sex;
    private String email;

    public Client(String name, int age, String sex, String email) {
        this.id = ID_POINTER++;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public void update(Response response) {
        System.out.println(response.getBody());
        System.out.println(response.getStatusCode());
        System.out.println(response.getHeaders());
    }
}
