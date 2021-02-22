package ru.itsjava.service;

import java.util.Scanner;

public class ScannerServiceImpl implements ScannerService{
    @Override
    public int readPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите цену");
        return scanner.nextInt();
    }
}
