package gr.codelearn.spring.app;

import gr.codelearn.spring.app.configuration.BackupTaskConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(namedQueriesLocation = "classpath:jpa-named-queries.properties")
public class AcmeFlixApplication {

	public static void main(String[] args) {

		SpringApplication.run(AcmeFlixApplication.class, args);
	}

}
