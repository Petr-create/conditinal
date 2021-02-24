package ru.itsjava.service;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Coffee;

@RequiredArgsConstructor
public class CoffeeServiceImpl implements CoffeeService{

    private final BufferedReaderService bufferedReaderService;
    private final ScannerService scannerService;

    @Override
    public void getCoffeeByPrice() {
        bufferedReaderService.menuReader("myconditinal-and-property/src/main/resources/menu.txt");
        int price = scannerService.readPrice();
        Coffee coffee = null;
        if(price == 60){
            coffee = new Coffee("Эспрессо");
        }else if(price == 80){
            coffee = new Coffee("Американо");
        }else if(price == 100){
            coffee = new Coffee("Капучино");
        }else if(price == 110){
            coffee = new Coffee("Латте");
        }else{
            System.out.println("Такого кофе у нас нет!");
        }
        System.out.println("Ваш выбор: " + coffee);
    }
}
