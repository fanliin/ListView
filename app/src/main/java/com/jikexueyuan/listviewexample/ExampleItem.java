package com.jikexueyuan.listviewexample;

/**
 * Created by fanlin on 2016/4/23.
 */
public abstract class ExampleItem {

    private String label;

    public ExampleItem(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public abstract void onAction();

    @Override
    public String toString() {
        return label;
    }
}
