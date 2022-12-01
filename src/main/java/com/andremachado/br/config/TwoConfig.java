package com.andremachado.br.config;
import javax.sql.DataSource;

import com.andremachado.br.repository.two.TestTwoRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories(
        basePackageClasses = TestTwoRepository.class,
        entityManagerFactoryRef = "authEntityManager")
public class TwoConfig {

    @Bean
    @ConfigurationProperties(prefix = "two.datasource")
    public DataSource twoDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean authEntityManager(
            EntityManagerFactoryBuilder builder,
            @Qualifier("twoDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("com.andremachado.model.two")
                .build();
    }
}
