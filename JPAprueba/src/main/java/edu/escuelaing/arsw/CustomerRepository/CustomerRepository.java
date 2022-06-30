package edu.escuelaing.arsw.CustomerRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.escuelaing.arsw.Customer.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName);

  Customer findById(long id);
}