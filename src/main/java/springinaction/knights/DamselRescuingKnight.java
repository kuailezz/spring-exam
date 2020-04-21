package springinaction.knights;

public class DamselRescuingKnight implements Knight{

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        this.quest.embark();
    }
    /*
     * DamselRescuingKnight 与 RescueDamselQuest紧耦合，DamselRescuingKnight这个骑士固定了只能完成拯救少女的探险（RescueDamselQuest），不能完成其他的探险。
     * 耦合的2面性，一方面，紧耦合的代码难以测试，难以复用，难以理解，容易出现“打地鼠”式的bug。另一方面，一定程度的耦合是必须的，完全没有耦合的代码什么行为也做不了。
     */

}
