package org.hmily.pattern.graphic.composite;

public class Leaf implements Component{

    @Override
    public void add() {
        System.out.println("Add Leaf!!");
    }

    @Override
    public void remove() {
        System.out.println("Remove Leaf!!");
    }
}
