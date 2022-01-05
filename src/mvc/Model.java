package mvc;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedList;
import java.util.List;

public class Model
{
    private String value;
    private List<PropertyChangeListener> listeners;
    public Model(String value)
    {
        this.value=value;
        listeners=new LinkedList<>();
    }
    public String getValue()
    {
        return value;
    }
    public void setValue(String value)
    {
        updateListeners(this.value,value);
        this.value=value;
    }
    public void addPropertyChangeListener(PropertyChangeListener listener)
    {
        listeners.add(listener);
    }
    private void updateListeners(String oldValue,String newValue)
    {
        for(PropertyChangeListener listener: listeners)
            listener.propertyChange(new PropertyChangeEvent(this,"value",oldValue,newValue));
    }
}