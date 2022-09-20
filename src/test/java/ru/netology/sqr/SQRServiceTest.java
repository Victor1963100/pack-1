package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {
    @Test
    public void test() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300); //min = 199, 200, 201; max = 299, 300, 301
        int expected = 3; //0, 1, 2, 3, 4

        Assertions.assertEquals(expected, actual);
        }
    }
