package springinaction.knights;


public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        this.quest.embark();
    }

    /*
     *  BraveKnight与DamselRescuingKnight不同的是探险任务由构造器参数传入，这是一种依赖注入，即构造器注入。
     *  传入的参数类型是Quest接口，任何实现Quest接口的探险行为类都可以注入到BraveKnight。不与任何特定的Quest实现发生耦合，实现松耦合。
     *  这个例子体现了Spring的一个关键策略： 使用依赖注入和面向接口实现松耦合。
     */
}
