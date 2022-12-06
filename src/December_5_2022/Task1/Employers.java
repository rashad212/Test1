package December_5_2022.Task1;

public abstract class Employers {

    Manager manager;
    Developer developer;
    Tester tester;

    Employers(Manager manager, Developer developer, Tester tester){
        this.manager=manager;
        this.developer=developer;
        this.tester=tester;
    }

    public Employers() {
    }

    @Override
    public String toString() {
        return "Employers{" +
                "manager=" + manager +
                ", developer=" + developer +
                ", tester=" + tester +
                '}';
    }
}
