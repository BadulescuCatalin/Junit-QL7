package com.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account act;
    @BeforeEach
    void setUp() {
        act = new Account(new String[]{"Visa", "Link"},
                "10-10-22", "11223344",
                "1234");
    }

    @Test
    @DisplayName("Match Accounts Success")
    void compareToSuccess() {
        Account inputObject = new Account(
                new String[]{"Link"},"10-10-22", "11223344",
                        "1234");
        assertEquals(0, act.compareTo(inputObject),
                "Login Failed");
    }

    @Test
    @DisplayName("Match Accounts Fail")
    void compareToFail() {
        Account inputObject = new Account(
                new String[]{"Revolut"},"10-10-22", "11223344",
                "1234");
        assertEquals(0, act.compareTo(inputObject),
                "Login Failed");
    }
}