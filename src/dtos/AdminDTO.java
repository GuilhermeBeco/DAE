package dtos;

import java.io.Serializable;

public class AdminDTO implements Serializable {
    private String username, password, email, name;
    private int adminCode;

    public AdminDTO(String username, String password, String email, String name, int adminCode) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.adminCode = adminCode;
    }

    public AdminDTO() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(int adminCode) {
        this.adminCode = adminCode;
    }
}
