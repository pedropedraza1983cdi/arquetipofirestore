package com.nttdata.terpel.arquetipofirestore.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.nttdata"})
@EntityScan("com.nttdata.terpel.arquetipofirestore.persistence.entidades")
@EnableAutoConfiguration
@ConditionalOnProperty(value = "spring.cloud.gcp.firestore.enabled", matchIfMissing = true)
public class ServiceConfiguration {
}
