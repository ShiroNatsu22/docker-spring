package com.archetype.springboot.infrastructure.service;

import com.archetype.springboot.domain.entity.Customer;
import com.archetype.springboot.domain.repository.CustomerRepository;
import com.archetype.springboot.domain.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final CustomerRepository ur;

    @Override
    public List<Customer> test() {
        return ur.findAll();
    }
}
