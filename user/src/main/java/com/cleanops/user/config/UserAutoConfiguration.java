package com.cleanops.user.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@AutoConfiguration
@ComponentScan("com.cleanops.user")
@EnableJpaRepositories("com.cleanops.user")
@EntityScan("com.cleanops.user")
public class UserAutoConfiguration {
}
