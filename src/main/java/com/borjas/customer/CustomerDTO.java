package com.borjas.customer;

import java.util.List;

public record CustomerDTO(
        Long id,
        String name,
        String email,
        Integer age,
        List<String> roles,
        String username
) {
}
