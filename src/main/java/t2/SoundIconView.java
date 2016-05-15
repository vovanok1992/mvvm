package t2;

/**
 * Created by vovan_000 on 15.05.2016.
 */
public class SoundIconView implements Changeable {

    ObservableModel model;

    boolean checked;
    String name;

    public SoundIconView(String name){
        this.name = name;
    }

    @Override
    public ChangeCallback getCallback() {
        return model1 -> {
            boolean newState = ((Integer) model1.get("sound")) > 0;
            if(newState != checked){
                checked = newState;
                updateView();
            }
        };
    }

    void updateView(){
        System.out.println(">>> CHECKBOX " + name + " state is now " + checked);
    }

    @Override
    public void setModel(ObservableModel model) {
        this.model = model;
    }
}
