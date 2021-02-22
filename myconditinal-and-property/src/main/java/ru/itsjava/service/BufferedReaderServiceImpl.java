package ru.itsjava.service;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.nio.file.Paths;

import static java.nio.file.Files.newBufferedReader;


public class BufferedReaderServiceImpl implements BufferedReaderService{

    @Override
    @SneakyThrows
    public void menuReader(String fileName) {
        BufferedReader br = newBufferedReader(Paths.get(fileName));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
