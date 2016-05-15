package t2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ObservableModel {

    private Set<ChangeCallback> listeners = new HashSet<>();

    private Map<String, Object> storage = new HashMap<>();


    public void set(String key, Object val, boolean silent){
        storage.put(key, val);
        if(!silent){
            notifyAllListeners();
        }
    }

    public void notifyAllListeners(){
        for(ChangeCallback changeCallback: listeners){
            changeCallback.onChange(this);
        }
    }

    public Object get(String key){
        return storage.get(key);
    }

    public void on(ChangeCallback changeCallback){
        listeners.add(changeCallback);
    }

    public void bind(Changeable changeable){
        on(changeable.getCallback());
        changeable.setModel(this);
    }

}