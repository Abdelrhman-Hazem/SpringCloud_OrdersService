package gov.iti.jets.Orders.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @GetMapping
    @RequestMapping("/welcome")
    public String welcome(){
        System.out.println("Hello from Order Controller");
        return "Hello from Order Controller Return";
    }

}
