package ru.netology.service;

import org.junit.Test;

import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldSpendExtra100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSpendExtra900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1100);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSpendExtra() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSpendExtra200() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(800);
        int expected = 200;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSpendExtra700() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1300);
        int expected = 700;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldNotSpendExtra1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}