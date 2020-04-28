package assemblyambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class MakeDessert {

    private Dessert dessert;

    @Autowired
    @Cold
    @Creamy
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public void making(){
        System.out.println("making.........");
    }
}
