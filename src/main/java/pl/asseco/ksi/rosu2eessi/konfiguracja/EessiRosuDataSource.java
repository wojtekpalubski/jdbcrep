package pl.asseco.ksi.rosu2eessi.konfiguracja;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories

public class EessiRosuDataSource {


    @Bean(name = "rosuDataSource")
    @ConfigurationProperties(prefix = "rosu.datasource")
    public DataSource rosuDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public JpaVendorAdapter sqlserverJpaVendorAdapter() {
        HibernateJpaVendorAdapter bean = new HibernateJpaVendorAdapter();
        bean.setDatabase(Database.SQL_SERVER);
        bean.setGenerateDdl(true);
        bean.setShowSql(true);
        return bean;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean rosuEntityManagerFactory(DataSource rosuDataSource,
                                                                           JpaVendorAdapter sqlserverJpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(rosuDataSource);
        bean.setJpaVendorAdapter(sqlserverJpaVendorAdapter);
        bean.setPackagesToScan("pl.asseco.ksi.rosu2eessi");
        return bean;
    }




    @Bean(name = "akeDataSource")
    @ConfigurationProperties(prefix = "ake.datasource")
    public DataSource akeDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean akeEntityManagerFactory(DataSource akeDataSource,
                                                                          JpaVendorAdapter postgresJpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(akeDataSource);
        bean.setJpaVendorAdapter(postgresJpaVendorAdapter);
        bean.setPackagesToScan("pl.asseco.ksi.rosu2eessi");
        return bean;
    }

    @Bean
    public JpaVendorAdapter postgresJpaVendorAdapter() {
        HibernateJpaVendorAdapter bean = new HibernateJpaVendorAdapter();
        bean.setDatabase(Database.POSTGRESQL);
        bean.setGenerateDdl(true);
        bean.setShowSql(true);
        return bean;
    }

}
