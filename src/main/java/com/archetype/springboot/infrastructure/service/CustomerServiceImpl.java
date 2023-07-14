package com.archetype.springboot.infrastructure.service;

import com.archetype.springboot.domain.entity.Customer;
import com.archetype.springboot.domain.repository.CustomerRepository;
import com.archetype.springboot.domain.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository ur;

    @Override
    public List<Customer> test() {
        return ur.findAll();
    }
}
