package com.arpan.expensemanager.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class BaseRestIT {

    @Autowired
    private MockMvc mockMvc;

    private String basePath;


    protected <T> T perform(String action, Class<T> clazz) {
//        mockMvc.perform()
        return null;
    }
}
