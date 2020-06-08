package com.abhishekd.springbootgraphql.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

/**
 * Customer POJO
 */
@Data
@Entity
@NoArgsConstructor
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName  = lastName;
    }
}
