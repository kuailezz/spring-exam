package assemblyambiguity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试类
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AssemblyConfig.class)
public class DessertTest {

    private Dessert dessert;

    @Autowired
    @Test
    public void setDessert(Dessert dessert){
        this.dessert = dessert;
    }
}
