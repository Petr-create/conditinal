package ru.itsjava.service;

import lombok.SneakyThrows;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.nio.file.Paths;

import static java.nio.file.Files.newBufferedReader;


public class BufferedReaderServiceImpl implements BufferedReaderService{

    @Override
    @SneakyThrows
    public void menuReader(String fileName) {
//        BufferedReader br = newBufferedReader(Paths.get(fileName));
//        String line;
//        while((line = br.readLine()) != null){
//            System.out.println(line);
//        }
        BufferedInputStream result = (BufferedInputStream)
                Config.class.getClassLoader().getResourceAsStream(fileName);
        byte [] b = new byte[5000];
        int val = 0;
        String txt = null;
        do {
            try {
                val = result.read(b);
                if (val > 0) {
                    txt += new String(b, 0, val);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (val > -1);
        System.out.println(txt);
    }
}
