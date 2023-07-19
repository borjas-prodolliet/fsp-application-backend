package com.borjas.customer;

import com.borjas.AbstractTestcontainers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerJDBCDataAccessServiceTest extends AbstractTestcontainers {

    private CustomerJDBCDataAccessService underTest;
    private final CustomerRowMapper customerRowMapper = new CustomerRowMapper();

    @BeforeEach
    void setUp() {
        underTest = new CustomerJDBCDataAccessService(
                getJdbcTemplate(),
                customerRowMapper
        );
    }

    @Test
    void selectAllCustomers() {
        // Given
        Customer customer = new Customer(
                FAKER.name().fullName(),
                FAKER.internet().safeEmailAddress() + "-" + UUID.randomUUID(),
                20
        );
        underTest.insertCustomer(customer);

        // When
        List<Customer> customers = underTest.selectAllCustomers();

        // Then
        assertThat(customers).isNotEmpty();
    }

    @Test
    void selectCustomerById() {
        // Given

        // When

        // Then
    }

    @Test
    void insertCustomer() {
        // Given

        // When

        // Then
    }

    @Test
    void existsPersonWithEmail() {
        // Given

        // When

        // Then
    }

    @Test
    void existsPersonWithId() {
        // Given

        // When

        // Then
    }

    @Test
    void deleteCustomerById() {
        // Given

        // When

        // Then
    }

    @Test
    void updateCustomer() {
        // Given

        // When

        // Then
    }
}