package t2;

/**
 * Created by vovan_000 on 15.05.2016.
 */
public class Main {

    static final String SOUND_KEY = "sound";

    public static void main(String[] args) {
        ObservableModel observableModel = new ObservableModel();

        SoundSliderView soundSliderView = new SoundSliderView("view1");
        SoundSliderView soundSliderView2 = new SoundSliderView("view2");
        SoundSliderView soundSliderView3 = new SoundSliderView("view3");
        SoundIconView soundIconView = new SoundIconView("checkbox1");
        SoundIconView soundIconView2 = new SoundIconView("checkbox2");


        observableModel.bind(SOUND_KEY, soundSliderView);
        observableModel.bind(SOUND_KEY, soundSliderView2);
        observableModel.bind(SOUND_KEY, soundSliderView3);
        observableModel.bind(SOUND_KEY, soundIconView);
        observableModel.bind(SOUND_KEY, soundIconView2);


        soundSliderView.setValue(10);
        soundSliderView3.setValue(0);
    }
}
