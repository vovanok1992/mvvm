import java.util.ArrayList;
import java.util.List;

public class SoundViewModel {

    SoundModel model;

    List<AbstractView> allSoundViews = new ArrayList<>();

    public void bind(AbstractView view){
        allSoundViews.add(view);
        view.onChange(new AbstractView.CallBack(){
            @Override
            public void valueChanged(int value){
                updateSoundValue(value);
                updateOtherViews(view);
            }
        });
        System.out.println("[I] " + view.name + " is now subscribed for model changes");
        view.updateState(model.getSoundValue());
    }

    private void updateOtherViews(AbstractView v){
        for (AbstractView view: allSoundViews){
            if(view == v) continue;
            view.updateState(model.getSoundValue());
        }
    }

    public void updateSoundValue(int value){
        model.setSoundValue(value);
    }

    public void setModel(SoundModel soundModel){
        this.model = soundModel;
    }
}
