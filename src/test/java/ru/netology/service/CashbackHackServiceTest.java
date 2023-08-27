package ru.netology.service;

import org.testng.annotations.Test;

import java.util.concurrent.Callable;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturnCashbackWith999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackWith1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashback1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1001;
        int actual = service.remain(-1);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackWith0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackWith1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackWith950() {
        CashbackHackService service = new CashbackHackService();

        int expected = 950;
        int actual = service.remain(50);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackWith555() {
        CashbackHackService service = new CashbackHackService();

        int expected = 445;
        int actual = service.remain(555);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackWith1999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(1999);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnCashbackWith1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
    }
    @Test
    public void shouldReturnCashbackWith2000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(2000);

        assertEquals(actual, expected);
    }
}
