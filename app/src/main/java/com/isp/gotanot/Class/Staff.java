package com.isp.gotanot.Class;

public class Staff extends User {
    public Staff(String name, String ID, String password, String eventIDs) {
        super(name, ID, password, "Staff", eventIDs);
    }
}
