package rewards;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import config.RewardsConfig;

// TODO-08: Get Spring Boot to populate the database - see application.properties
// TODO-09: Get Hibernate to show its SQL nicely - see application.properties
// TODO-10: Stop Hibernate from populating the database - see application.properties
//
// TODO-11: Add an annotation to THIS class that tells JPA where to find entities.
//          Specify the same package that setPackagesToScan is using (below).
//
// TODO-12: Delete all three bean methods as we don't need them any more.
//          Spring Boot will do it all for us.
//
// TODO-13: Annotate to enable Spring Boot auto-configuration.
//
// TODO-14: Run the test. The test still should pass.
@Configuration
@EnableJpaRepositories("rewards")
@EnableAutoConfiguration
@Import(RewardsConfig.class)
public class SystemTestConfig {
	
		
}
