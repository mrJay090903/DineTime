package com.example.dinetime;

public class HelperClass {

    String fullname, address, email, password;

    public HelperClass() {
    }

    public HelperClass(String fullname, String address, String email, String password) {
        this.fullname = fullname;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
