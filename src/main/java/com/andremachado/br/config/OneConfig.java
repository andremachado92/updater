package com.andremachado.br.config;
import javax.sql.DataSource;

import com.andremachado.br.repository.one.TestOneRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories(
        basePackageClasses = TestOneRepository.class,
        entityManagerFactoryRef = "oneEntityManager")
public class OneConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "one.datasource")
    public DataSource oneDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean appEntityManager(
            EntityManagerFactoryBuilder builder,
            @Qualifier("oneDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("com.andremachado.model.one")
                .build();
    }
}
