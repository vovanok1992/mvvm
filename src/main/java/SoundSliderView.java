/**
 * Created by vovan_000 on 14.05.2016.
 */
public class SoundSliderView extends AbstractView {

    public SoundSliderView(String name){
        this.name = name;
    }

    @Override
    public void updateState(int value) {
        System.out.println(">> SOUND SLIDER [" + name + "] UPDATED POSITION TO MATCH VALUE " + value);
    }
}
