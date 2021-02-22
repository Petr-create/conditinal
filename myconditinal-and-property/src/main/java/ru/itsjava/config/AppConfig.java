package ru.itsjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.service.*;

@Configuration
public class AppConfig {

    @Bean
    public BufferedReaderService bufferedReaderService(){
        return new BufferedReaderServiceImpl();
    }

    @Bean
    public ScannerService scannerService(){
        return new ScannerServiceImpl();
    }

    @Bean
    public CoffeeService coffeeService(BufferedReaderService bufferedReaderService, ScannerService scannerService){
        return new CoffeeServiceImpl(bufferedReaderService, scannerService);
    }


}
