package qtb.yns.my_project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("dev")
public class ApplicationConfig {

    @Bean
    public firstClass myFirstBean() {
        return  new firstClass("something else");
    }

    @Bean
    public firstClass mySecondBean() {
        return  new firstClass("something else 2 ");
    }
}
