package t1;

/**
 * Created by vovan_000 on 14.05.2016.
 */
public class SoundModel {

    private int soundValue;

    public int getSoundValue() {
        return soundValue;
    }

    public void setSoundValue(int soundValue) {
        System.out.println("||| Model value is now = " + soundValue);
        this.soundValue = soundValue;
    }
}
