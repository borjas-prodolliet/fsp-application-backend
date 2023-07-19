package com.borjas.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age
) {
}
