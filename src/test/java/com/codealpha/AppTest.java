package com.codealpha;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void testGetGreeting() {
        String result = App.getGreeting();
        assertNotNull(result);
        assertTrue(result.contains("DevOps"));
    }
}
