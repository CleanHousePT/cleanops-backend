package com.cleanops.sharedweb.config;

import com.cleanops.sharedweb.filtering.QueryProcessor;
import com.cleanops.sharedweb.filtering.SpecificationBuilder;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

@AutoConfiguration
@ComponentScan("com.cleanops.sharedweb")
public class SharedWebAutoConfiguration {

    /**
     * Provides a prototype-scoped QueryProcessor.
     * Prototype scope is used here because QueryProcessor is a lightweight wrapper
     * around a generic type T, ensuring clean separation for different entities.
     */
    @Bean
    @Scope("prototype")
    public <T> QueryProcessor<T> queryProcessor(SpecificationBuilder<T> builder) {
        return new QueryProcessor<>(builder);
    }
}
