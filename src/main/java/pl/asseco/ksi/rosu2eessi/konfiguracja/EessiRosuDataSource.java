package pl.asseco.ksi.rosu2eessi.konfiguracja;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@EnableJdbcRepositories

public class EessiRosuDataSource {

    @Bean(name = "akeDataSource")
    @ConfigurationProperties(prefix = "ake.datasource")
    public DataSource akeDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "rosuDataSource")
    @ConfigurationProperties(prefix = "rosu.datasource")
    public DataSource rosuDataSource() {
        return DataSourceBuilder.create().build();
    }
}
