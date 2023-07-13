package com.archetype.springboot.domain.repository;

import com.archetype.springboot.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
