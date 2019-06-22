package org.hmily.pattern.graphic.composite;

public class Composite implements Component{

    private Component children;

    public Composite(Component children) {
        this.children = children;
    }

    @Override
    public void add() {
        System.out.println("Add Composite!!");
    }

    @Override
    public void remove() {
        System.out.println("Remove Composite!!");
    }
}
