package soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class CDPlayer implements MediaPlayer{

    //注解用在属性上
    @Autowired
    private CompactDisc compactDisc;

    //注解用在构造方法上
    @Autowired(required = false)
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }


    //注解用在setter方法上
    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    //注解用在普通方法上
    @Autowired
    public void insertDisc(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }
}
