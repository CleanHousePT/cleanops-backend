package com.cleanops.shared;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@AutoConfiguration
@ComponentScan("com.cleanops.shared")
@EnableJpaRepositories("com.cleanops.shared")
@EntityScan("com.cleanops.shared")
public class SharedAutoConfiguration {
}
