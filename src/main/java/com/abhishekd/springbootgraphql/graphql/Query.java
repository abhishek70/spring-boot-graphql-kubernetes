package com.abhishekd.springbootgraphql.graphql;

import com.abhishekd.springbootgraphql.model.Customer;
import com.abhishekd.springbootgraphql.repository.CustomerRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    private CustomerRepository customerRepository;

    public Query(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Iterable<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}

