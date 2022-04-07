package com.altiusdigital.diskover.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Component
@ComponentScan("com.altiusdigita.diskover")
@Path ("/jersey")
public class DiskoverController {

    @POST
    @Path ("/")
    @Consumes("application/json")
    public String someEureka(){
        System.out.println("Eureka");
        return "Eureka";
    }
}
