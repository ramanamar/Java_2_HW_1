/**
 * Created by Raman Kryvasheyeu on 13.09.2016.
 */
public class TrimTrail extends Obstacle{

    Obstacle[] TrimTrail = {new Cross(1000.0f), new Wall(1.0f), new Water(20.0f), new Cross(250.0f)};
    Sportsman[] mates = {new Cat("Whiskas"), new Dog("Polkan"), new Horse("Verter"), new Human("Vasya")};

    @Override
    public void doIt(Sportsman s) {
        for (Sportsman sp : mates) {
            for (Obstacle o : TrimTrail) {
                o.doIt(s);
                if (!sp.isOnDistance()) break;
            }
        }
    }
/*
    //@Override
    public void doIt(Team t) {
        t.run(runDistance);
        t.jump(jumpHeight);
        t.swim(swimDistance);
        t.run(runDistance);
    }*/
}


/*
    public TrimTrail(float runDistance, float jumpHeight, float swimDistance) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }
*/

/*    public TrimTrail(float runDistance, float jumpHeight, float swimDistance, float runDistance2) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
        this.runDistance2 = runDistance2;
    }*/