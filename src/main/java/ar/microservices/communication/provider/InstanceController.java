package ar.microservices.communication.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Author: m
 * Date: 9/16/26
 * Project Name: communication
 * Description: beExcellent
 */
@RestController
public class InstanceController {

    @Value("${server.port}")
    private int PORT = 9091;

    private final String instanceId = java.util.UUID.randomUUID().toString();

    @GetMapping("/instance-info")
    public String getInstanceInfo(){
        System.out.println("Request received at instance running on port: " + PORT);
        return "Instance served by Port " + PORT + ". Instance ID: " + instanceId;
    }
}
