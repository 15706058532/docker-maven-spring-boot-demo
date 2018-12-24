package com.lzf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 10:19
 *
 * @author Li Zhenfeng
 */
@SpringBootApplication
@EnableTransactionManagement
public class Demo {
    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }
}
