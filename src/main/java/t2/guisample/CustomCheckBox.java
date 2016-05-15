package t2.guisample;

import t2.ChangeCallback;
import t2.Changeable;
import t2.ObservableModel;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by vovan_000 on 15.05.2016.
 */
public class CustomCheckBox extends JCheckBox implements Changeable{
    ObservableModel model;


    public CustomCheckBox(){
        super();
        addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                setSelected(e.getStateChange() == ItemEvent.SELECTED);
            }
        });
    }

    @Override
    public ChangeCallback getCallback() {
        return new ChangeCallback() {
            @Override
            public void onChange(ObservableModel model) {
                boolean newCheckedValue = ((Integer)model.get("sound")) == 0;
                if(isSelected()!=newCheckedValue){
                    setSelected(newCheckedValue);
                }
            }
        };
    }

    @Override
    public void setSelected(boolean b) {
        super.setSelected(b);
        if(model!=null){
            System.out.println("SETTING TO MODEL " + b);
            model.set("sound", b ? 0 : 100, false);
        }
    }



    @Override
    public void setModel(ObservableModel model) {
        this.model = model;
    }
}
