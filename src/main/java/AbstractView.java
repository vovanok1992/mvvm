/**
 * Created by vovan_000 on 14.05.2016.
 */
public abstract class AbstractView {

    protected String name;

    interface CallBack{
        void valueChanged(int value);
    }

    private CallBack c;

    void onChange(CallBack c){
        this.c = c;
    }

    abstract void updateState(int value);

    public void setValue(int value){
        System.out.println("<< [" + name + "] is changed value to " + value);
        updateState(value);
        c.valueChanged(value);
    }
}
