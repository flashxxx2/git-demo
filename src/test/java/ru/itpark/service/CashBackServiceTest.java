package ru.itpark.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackServiceTest {

    @Test
    void initials() {
        {
            CashBackService service = new CashBackService();
            String actual = service.initials("Василий Петров");
            String expected = "ВП";
            assertEquals(expected,actual);

        }
    }
}