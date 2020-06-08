package com.abhishekd.springbootgraphql.repository;

import com.abhishekd.springbootgraphql.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Customer Repository
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
