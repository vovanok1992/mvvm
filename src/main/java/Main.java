public class Main {

    static SoundIconView soundIconView = new SoundIconView("icon1");
    static SoundSliderView soundSliderView = new SoundSliderView("slider1");
    static SoundSliderView soundSliderView2 = new SoundSliderView("slider2");

    static SoundModel soundModel = new SoundModel();

    public static void main(String[] args) {
        soundModel.setSoundValue(1);

        SoundViewModel soundViewModel = new SoundViewModel();
        soundViewModel.setModel(soundModel);

        soundViewModel.bind(soundIconView);
        soundViewModel.bind(soundSliderView);
        soundViewModel.bind(soundSliderView2);

        soundSliderView.setValue(2);
    }
}
