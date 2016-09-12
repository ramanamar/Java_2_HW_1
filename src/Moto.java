/**
 * Created by FlameXander on 09.09.2016.
 */
public class Moto implements Transport {
    @Override
    public float getMaxDriveDist() {
        return 20000.0f;
    }

    @Override
    public float getMaxJumpHeight() {
        return 0.0f;
    }

    @Override
    public float getMaxSwimDistance() {
        return 5.0f;
    }
}
