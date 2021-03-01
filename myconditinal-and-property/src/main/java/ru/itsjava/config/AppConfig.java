package ru.itsjava.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.condition.ConditionalOnScanner;
import ru.itsjava.property.CoffeeProperty;
import ru.itsjava.service.*;

@Configuration
@EnableConfigurationProperties(CoffeeProperty.class)
public class AppConfig {

    @Bean
    @ConditionalOnMissingBean(MenuReaderService.class)
    public MenuReaderService bufferedReaderService(){
        return new MenuReaderServiceImpl();
    }

    @Bean
    @ConditionalOnMissingBean(ScannerService.class)
    @ConditionalOnScanner
    //@ConditionalOnProperty(value = "choosecoffee.choose", havingValue = "false")
    public ScannerService scannerService(){
        return new ScannerServiceImpl();
    }

    @Bean
    @ConditionalOnMissingBean(ScannerService.class)
    //@ConditionalOnProperty(value = "choosecoffee.choose", havingValue = "true")
    public CoffeeService notChooseCoffee(){
        return new CoffeeBadServiceImpl();
    }


    @Bean
    @ConditionalOnMissingBean(CoffeeService.class)
    public CoffeeService coffeeService(MenuReaderService bufferedReaderService, ScannerService scannerService){
        return new CoffeeServiceImpl(bufferedReaderService, scannerService);
    }


}
