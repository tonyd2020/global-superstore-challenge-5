package com.ltp.globalsuperstore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public StoreRepository storeRepository() {
        return new StoreRepository();
    }

    @Bean
    public StoreService storeService() {
        return new StoreService();
    }
}
