package entities;

import java.io.Serializable;

public class Admin implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String comment;

    private static final long serialVersionUID = 1L;

    public Admin(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Admin(Integer id, String username, String password, String comment) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.comment = comment;
    }

    public Admin() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}