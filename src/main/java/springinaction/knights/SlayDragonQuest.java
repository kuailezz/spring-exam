package springinaction.knights;


import java.io.PrintStream;

public class SlayDragonQuest implements Quest{
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream; //构造器依赖注入
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay tht dragon!");
    }
}
