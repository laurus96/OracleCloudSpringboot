package com.example.oraclecloudspringboot;

import com.example.oraclecloudspringboot.entity.UserEntity;
import com.example.oraclecloudspringboot.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.List;
import java.util.Optional;

@SpringBootApplication
@Slf4j
public class OracleCloudSpringbootApplication implements CommandLineRunner {

    private final UserRepository repository;

    public OracleCloudSpringbootApplication(UserRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(OracleCloudSpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        List<UserEntity> users = repository.findAll();
        Optional<UserEntity> user = repository.findById(2L);

        for (UserEntity u:
             users) {
            log.info(u.getClass() + " " + u.getName() + " " + u.getId());

        }

        user.ifPresent(userEntity -> log.info(userEntity.getClass() + " " + userEntity.getName()));



    }
}
