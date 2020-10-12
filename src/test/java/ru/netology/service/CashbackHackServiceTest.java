package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldSpendExtra100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSpendExtra900() {
        CashbackHackService cashbackHackService = new CashbackHackService ();
        int actual = cashbackHackService.remain(1100);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSpendExtra() {
        CashbackHackService cashbackHackService = new CashbackHackService ();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }
}