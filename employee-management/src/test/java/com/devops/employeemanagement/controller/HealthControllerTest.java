package com.devops.employeemanagement.controller;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HealthControllerTest {

    @Test
    void healthShouldReturnUpStatus() {
        HealthController controller = new HealthController();

        Map<String, String> response = controller.health();

        assertEquals("UP", response.get("status"));
        assertEquals("employee-management", response.get("application"));
    }
}
