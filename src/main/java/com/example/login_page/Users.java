package com.example.login_page;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "users")
@Entity
public class Users {

    @Column
    private String email;
    @Id
    @Column
    private String username;
    @Column
    private String password;
    public Users(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Users() {}

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
