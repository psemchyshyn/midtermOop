package client;


import com.sendgrid.Response;

// Perhaps we will later would like to notify not only clients
public interface Subject {
    void update(Response response);
}
