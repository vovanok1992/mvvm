package t2;

/**
 * Created by vovan_000 on 15.05.2016.
 */
public interface Changeable {
    ChangeCallback getCallback();

    void setModel(ObservableModel model);
}
