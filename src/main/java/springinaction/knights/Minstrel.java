package springinaction.knights;

import java.io.PrintStream;

/**
 * 用于aop切面的类
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest(){
        System.out.println("Fa la la, the knight is so breave!");
        stream.println("Fa la la, the knight is so breave!");
    }
    public void singAfterQuest(){
        stream.println("Tee hee hee, the breave knight did embark on a quest!");
    }
}
