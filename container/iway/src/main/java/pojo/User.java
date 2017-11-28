package pojo;

import java.io.Serializable;

public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private String email;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
