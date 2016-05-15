package t2;

/**
 * Created by vovan_000 on 15.05.2016.
 */
public class SoundSliderView implements Changeable{

    ObservableModel observableModel;

    String name;
    int soundLevel;


    public SoundSliderView(String name){
        this.name = name;
    }

    public void updateView(){
        System.out.println(">>> UPDATING " + name + " to value " + soundLevel);
    }

    public void setValue(int value){
        System.out.println("<<< " + name + " is changed value to " + value);
        this.soundLevel = value;
        observableModel.set("sound", value, false);
    }

    @Override
    public ChangeCallback getCallback() {
        return model -> {
            Integer value = (Integer) model.get("sound");
            if(value != soundLevel){
                soundLevel = value;
                updateView();
            }
        };
    }

    @Override
    public void setModel(ObservableModel model) {
        this.observableModel = model;
    }
}
