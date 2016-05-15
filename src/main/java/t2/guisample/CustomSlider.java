package t2.guisample;

import t2.ChangeCallback;
import t2.Changeable;
import t2.ObservableModel;

import javax.swing.*;

/**
 * Created by vovan_000 on 15.05.2016.
 */
public class CustomSlider extends JSlider implements Changeable {
    ObservableModel observableModel;

    @Override
    public ChangeCallback getCallback() {
        return new ChangeCallback() {
            @Override
            public void onChange(ObservableModel model) {
                int newVal = (Integer) model.get("sound");
                if(getValue() != newVal){
                    setValue(newVal);
                }

            }
        };
    }

    @Override
    public void setValue(int n) {
        if(n>getMaximum()){
            n = getMaximum();
        }
        super.setValue(n);
        if(observableModel!=null){
            observableModel.set("sound", n, false);
        }
    }

    @Override
    public void setModel(ObservableModel model) {
        this.observableModel = model;
    }
}
