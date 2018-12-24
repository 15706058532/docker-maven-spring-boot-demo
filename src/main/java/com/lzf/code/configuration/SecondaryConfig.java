package com.lzf.code.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;
import java.util.Objects;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactorySecondary",
        transactionManagerRef = "transactionManagerSecondary",
        //设置Repository所在位置
        basePackages = {"com.lzf.code.alliance.repository"})
public class SecondaryConfig {

    private final DataSource secondaryDataSource;
//    private final JpaProperties jpaProperties;

    @Autowired
    public SecondaryConfig(@Qualifier("secondaryDataSource") DataSource secondaryDataSource/*, JpaProperties jpaProperties*/) {
        this.secondaryDataSource = secondaryDataSource;
//        this.jpaProperties = jpaProperties;
    }

    @Bean(name = "entityManagerSecondary")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return Objects.requireNonNull(entityManagerFactorySecondary(builder).getObject()).createEntityManager();
    }

    @Bean(name = "entityManagerFactorySecondary")
    public LocalContainerEntityManagerFactoryBean entityManagerFactorySecondary(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(secondaryDataSource)
//                .properties(getVendorProperties())
                //设置实体类所在位置
                .packages("com.lzf.code.alliance.entity")
                .persistenceUnit("secondaryPersistenceUnit")
                .build();
    }

//    private Map<String, Object> getVendorProperties() {
//        HibernateSettings hibernateSettings = new HibernateSettings();
//
//        return jpaProperties.getHibernateProperties(hibernateSettings);
//    }

    @Bean(name = "transactionManagerSecondary")
    PlatformTransactionManager transactionManagerSecondary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactorySecondary(builder).getObject());
    }

}