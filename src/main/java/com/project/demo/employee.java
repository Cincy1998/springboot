package com.project.demo;

import lombok.Data;

@Data
public class employee {

    private String fname;
    private String lname;

    public employee(String fname,String lname) {
        this.fname = fname;
        this.lname = lname;
    }

}

