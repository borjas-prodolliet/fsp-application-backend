package com.borjas.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository("list")
public class CustomerListDataAccessService implements CustomerDao {

    private final List<Customer> customerList;

    public CustomerListDataAccessService() {
        this.customerList = new ArrayList<>();
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customerList;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer customerId) {
        return customerList.stream()
                .filter(customer -> customer.getId().equals(customerId))
                .findFirst();
    }

    @Override
    public void insertCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public boolean existsPersonWithEmail(String email) {
        return customerList.stream()
                .anyMatch(c -> c.getEmail().equals(email));
    }

    @Override
    public boolean existsPersonWithId(Integer id) {
        return customerList.stream()
                .anyMatch(c -> c.getId().equals(id));
    }

    @Override
    public void deleteCustomerById(Integer customerId) {
        customerList.stream()
                .filter(c -> c.getId().equals(customerId))
                .findFirst()
                .ifPresent(customerList::remove);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerList.add(customer);
    }
}
