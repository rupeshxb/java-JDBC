package com.company.JDBCwithConsole;

public class Student {
    private int id;

    private String name;
    private String email;
    private String phone;


    // Constructors
    public Student() {}


    public Student(int id, String name, String email, String phone) {
        this.id = id; // set the default value for the id parameter
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
    }
}

