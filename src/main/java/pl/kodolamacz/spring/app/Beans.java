package pl.kodolamacz.spring.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by acacko on 29.10.17
 */
@Configuration
@ComponentScan(value = "pl.kodolamacz.spring.app")
// albo:
//@ComponentScan // wtedy skanuje ten package i wszystkie wgłąb
@ImportResource("classpath:context.xml")
public class Beans {

}
