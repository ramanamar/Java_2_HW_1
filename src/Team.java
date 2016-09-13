/**
 * Created by Raman Kryvasheyeu on 13.09.2016.
 */
public class Team implements Sportsman{
    private final String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
        Sportsman[] mates = {new Cat("Whiskas"), new Dog("Polkan"), new Horse("Verter"), new Human("Vasya")};
    }

    @Override
    public void run(float dist) {

    }

    @Override
    public void jump(float height) {

    }

    @Override
    public void swim(float dist) {

    }

    @Override
    public boolean isOnDistance() {
        return true;
    }

    @Override
    public void showResults() {
        if (isActive)
            System.out.println(name + " - ok");
        else
            System.out.println(name + " - failed");
    }
}
