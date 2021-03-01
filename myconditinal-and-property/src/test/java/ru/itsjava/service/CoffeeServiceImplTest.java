package ru.itsjava.service;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.when;

@SpringBootTest
@DisplayName("Класс CoffeeServiceImpl должен: ")
public class CoffeeServiceImplTest {

    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    ScannerService scannerService = Mockito.mock(ScannerService.class);

    @Autowired
    CoffeeService coffeeService;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    @DisplayName("иметь корректный метод getCoffeeByPrice")
    public void shouldHaveCorrectChooseCoffee(){
        when(scannerService.readPrice()).thenReturn(60);
        coffeeService.getCoffeeByPrice();
        Assert.assertEquals("Эспрессо", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
