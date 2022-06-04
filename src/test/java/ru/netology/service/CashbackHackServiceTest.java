package ru.netology.service;

import static org.junit.Assert.*;
import org.junit.Test;


public class CashbackHackServiceTest {

    @Test
            //сумма меньше 1000
    public void cashbackMinC() {
        int amount = 800;
        int expectedRemainMinC = 200;
        CashbackHackService cash = new CashbackHackService();
        int actualRemainMinC = cash.remain(amount);
        assertEquals(expectedRemainMinC, actualRemainMinC);

    }

    @Test
            // сумма равна 1000
    public void cashbackEquallyC() {
        int amount = 1000;
        int expectedRemainEC = 0;
        CashbackHackService cash = new CashbackHackService();
        int actualRemainEC = cash.remain(amount);
        assertEquals(expectedRemainEC, actualRemainEC);

    }

    @Test
    // сумма больше 1000
    public void cashbackMaxC() {
        int amount = 1700;
        int expectedRemainMaxC = 300;
        CashbackHackService cash = new CashbackHackService();
        int actualRemainMaxC = cash.remain(amount);
        assertEquals(expectedRemainMaxC, actualRemainMaxC);

    }

}