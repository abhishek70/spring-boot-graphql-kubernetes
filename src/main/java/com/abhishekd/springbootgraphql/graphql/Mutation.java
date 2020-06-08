package com.abhishekd.springbootgraphql.graphql;

import com.abhishekd.springbootgraphql.model.Customer;
import com.abhishekd.springbootgraphql.repository.CustomerRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    private CustomerRepository customerRepository;

    public Mutation(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer addCustomer(String firstName, String lastName) {

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);

        customerRepository.save(customer);
        return customer;
    }
}
