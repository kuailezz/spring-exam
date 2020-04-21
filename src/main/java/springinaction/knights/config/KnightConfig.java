package springinaction.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springinaction.knights.BraveKnight;
import springinaction.knights.Knight;
import springinaction.knights.Quest;
import springinaction.knights.SlayDragonQuest;

/**
 * java配置方式注入
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
    /*
     * 不管是xml配置还是Java配置，依赖注入带来的收益相同。
     * BraveKnight依赖于Quest，但是它不知道传给它的是什么类型的Quest，也不知道来自哪里，只有spring通过配置，能够了解这些组成部分是如何装配起来的。
     * 这样可以在不改变所依赖的类的情况下，修改依赖关系。
     */
}
