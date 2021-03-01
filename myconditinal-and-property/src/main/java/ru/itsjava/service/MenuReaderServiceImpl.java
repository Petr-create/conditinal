package ru.itsjava.service;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.nio.file.Files.newBufferedReader;


public class MenuReaderServiceImpl implements MenuReaderService {

    @Override
    @SneakyThrows
    public void menuReader(String fileName) {
        BufferedReader br = new BufferedReader
                (new InputStreamReader(MenuReaderServiceImpl.class.getResourceAsStream(fileName)));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
