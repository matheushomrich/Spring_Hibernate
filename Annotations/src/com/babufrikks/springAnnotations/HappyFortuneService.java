package com.babufrikks.springAnnotations;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;

@Component("eja")
public class HappyFortuneService implements FortuneService {

    File file = new File("src/fortunes.txt");
    FileReader fileReader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    StringBuffer stringBuffer = new StringBuffer();
    String line;


    public HappyFortuneService() throws FileNotFoundException {
    }

    @PostConstruct
    public void testePostContruct() throws IOException {
        System.out.println("Inside method - init @PostContruct method :)");
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            stringBuffer.append(line);      //appends line to string buffer
        }
    }

    @Override
    public String getFortune() {
        return "deito pai";
    }
}
