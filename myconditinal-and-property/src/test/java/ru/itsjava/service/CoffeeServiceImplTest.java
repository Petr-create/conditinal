package ru.itsjava.service;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.when;

@SpringBootTest
@DisplayName("Класс CoffeeServiceImpl должен: ")
public class CoffeeServiceImplTest {

    ByteArrayOutputStream output = new ByteArrayOutputStream();
    @MockBean
    ScannerService scannerService = Mockito.mock(ScannerService.class);

    @Autowired
    CoffeeService coffeeService;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    @DisplayName("иметь корректный метод getCoffeeByPrice")
    public void shouldHaveCorrectChooseCoffee(){
        when(scannerService.readPrice()).thenReturn(60);
        coffeeService.getCoffeeByPrice();
        Assertions.assertEquals("Эспрессо", output.toString());
    }

    @AfterEach
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
