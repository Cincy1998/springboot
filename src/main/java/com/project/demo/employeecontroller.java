package com.project.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class employeecontroller {

    @RequestMapping(value = "/hi")
    public employee getdata() {

        return new employee("cincy", "angela");
    }
    @GetMapping("{fname}/{lname}")
    public employee getdata1(@PathVariable ("fname")String fname , @PathVariable("lname")String lname){
        return new employee("adam","eve");
    }


    @GetMapping("/employee/enquiry")
    public employee getdata2(@PathParam("fname") String fname , @PathParam("lname") String lname){
        return new employee(fname,lname);
    }

}
