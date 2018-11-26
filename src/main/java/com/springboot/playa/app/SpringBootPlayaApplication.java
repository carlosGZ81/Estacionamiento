package com.springboot.playa.app;

import com.springboot.playa.app.models.service.IUploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPlayaApplication implements CommandLineRunner{

    @Autowired
    IUploadFileService uploadFileService;
    
    public static void main(String[] args) {
        SpringApplication.run(SpringBootPlayaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        uploadFileService.deleteAll();
        uploadFileService.init();
    }
   
}
