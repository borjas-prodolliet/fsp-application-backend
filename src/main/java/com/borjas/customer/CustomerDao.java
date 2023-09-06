package com.borjas.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomerById(Long customerId);
    void insertCustomer(Customer customer);
    boolean existsCustomerWithEmail(String email);
    boolean existsCustomerWithId(Long id);
    void deleteCustomerById(Long customerId);
    void updateCustomer(Customer customer);
    Optional<Customer> selectUserByEmail(String email);
}
