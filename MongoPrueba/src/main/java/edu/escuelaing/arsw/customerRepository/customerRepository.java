package edu.escuelaing.arsw.customerRepository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.escuelaing.arsw.Customer.Customer;


public interface customerRepository extends MongoRepository<Customer, String> {
    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);


}
