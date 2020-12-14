package com.isp.gotanot.Class;

public class Student extends User {
    public Student(String name, String ID, String password, String eventIDs) {
        super(name, ID, password, "Student", eventIDs);
    }
}
