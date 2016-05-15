package t1;

/**
 * Created by vovan_000 on 14.05.2016.
 */
public class SoundIconView extends AbstractView {

    public SoundIconView(String name){
        this.name = name;
    }

    @Override
    public void updateState(int value) {
        System.out.println(">> SOUND ICON [" + name + "] IS UPDATED TO MATCH VALUE=" + value);
    }
}
