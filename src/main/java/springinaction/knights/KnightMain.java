package springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 读取配置文件，创建spring应用的上下文
 */
public class KnightMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
