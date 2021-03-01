package ru.itsjava.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("choosecoffee")
public class CoffeeProperty {
    private boolean isChoose = true;
}
