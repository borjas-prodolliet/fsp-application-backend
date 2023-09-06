package com.borjas.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        String password,
        Integer age
) {
}
