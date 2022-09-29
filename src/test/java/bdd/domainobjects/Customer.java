package bdd.domainobjects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
