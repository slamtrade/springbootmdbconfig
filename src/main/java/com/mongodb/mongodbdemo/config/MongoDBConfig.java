package com.mongodb.mongodbdemo.config;

import com.mongodb.mongodbdemo.repository.EmailRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = EmailRepository.class)
@Configuration

public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmailRepository usersRepository) {
        return strings -> {};
    }
}
