package soundSystem;

import org.springframework.stereotype.Component;

/**
 * 播放器实现类
 */
@Component
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt Pepper's Loneli Heart Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
