package ru.itsjava.service;

public class CoffeeBadServiceImpl implements CoffeeService{
    @Override
    public void getCoffeeByPrice() {
        System.out.println("Вот вам самый хреновый кофе!");
    }
}
