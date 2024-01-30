package com.ss.user.management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JPAAuditConfig {

    @Bean
    public AuditorAware<Long> auditorProvider() {
        return () -> Optional.of(1L);

        //todo get user id by extracting user token later
    }

}
