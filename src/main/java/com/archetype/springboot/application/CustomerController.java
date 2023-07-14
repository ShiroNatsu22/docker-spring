package com.archetype.springboot.application;

import com.archetype.springboot.domain.entity.Customer;
import com.archetype.springboot.domain.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping
public class CustomerController {

    private final CustomerService userService;

    @RequestMapping("/user/register")
    public List<Customer> register() {
        //
        return userService.test();
    }

}