package ru.itsjava.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CoffeeServiceImplTest {

    @Autowired
    MenuReaderService bufferedReaderService;
    @Autowired
    ScannerService scannerService;

    @Test
    public void getCoffeeByPrice(){

    }
}
