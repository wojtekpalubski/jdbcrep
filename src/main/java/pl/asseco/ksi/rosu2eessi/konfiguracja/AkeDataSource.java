package pl.asseco.ksi.rosu2eessi.konfiguracja;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

import javax.sql.DataSource;

//@Configuration
//@EnableJdbcRepositories
//@ConfigurationProperties(prefix = "ake.datasource")
//@Setter
//@Getter
public class AkeDataSource {
//    private String url="jdbc:postgresql://172.29.14.161:5432/AKE";
//    @Bean(name = "akeDataSource")
//    @ConfigurationProperties(prefix = "ake.datasource")
//    public DataSource akeDataSource() {
//        return DataSourceBuilder.create().build();
//    }
}
