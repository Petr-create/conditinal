package ru.itsjava;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.itsjava.service.MenuReaderService;
import ru.itsjava.service.ScannerService;

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
