package soundSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
public class CDConfig {
    //声明bean
    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }
}
