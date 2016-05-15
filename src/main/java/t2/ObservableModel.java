package t2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ObservableModel {

    private Map<String, Set<ChangeCallback>> listeners = new HashMap<>();

    private Map<String, Object> storage = new HashMap<>();


    public void set(String key, Object val, boolean silent) {
        storage.put(key, val);
        if (!silent) {
            notifyListeners(key);
        }
    }

    public void notifyListeners(String key) {
        Set<ChangeCallback> callbacks = listeners.get(key);
        for (ChangeCallback changeCallback : callbacks) {
            changeCallback.onChange(this);
        }
    }

    public Object get(String key) {
        return storage.get(key);
    }

    public void on(String key, ChangeCallback changeCallback) {
        if (!listeners.containsKey(key)) {
            listeners.put(key, new HashSet<>());
        }
        listeners.get(key).add(changeCallback);
    }

    public void bind(String key, Changeable changeable) {
        on(key, changeable.getCallback());
        changeable.setModel(this);
    }

}