package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    void cashbackMin () {
        int amount = 900;
        int expectedRemainMin = 100;
        CashbackHackService cash = new CashbackHackService();
    int actualRemainMin = cash.remain(amount);
        assertEquals(actualRemainMin, expectedRemainMin);

    }

    @Test
    void cashbackEqually () {
        int amount = 1000;
        int expectedRemainE = 0;
        CashbackHackService cash = new CashbackHackService();
        int actualRemainE = cash.remain(amount);
        assertEquals(actualRemainE, expectedRemainE);

    }

    @Test
    void cashbackMax () {
        int amount = 1300;
        int expectedRemainMax = 700;
        CashbackHackService cash = new CashbackHackService();
        int actualRemainMax = cash.remain(amount);
        assertEquals(actualRemainMax, expectedRemainMax);

    }

}