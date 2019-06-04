package org.hmily.pictureShowPattern.composite;

public class CompositePatternDemo {


    /**
     * 组合模式
     * @param args
     */
    public static void main(String[] args) {
            Component component=new Composite(new Component() {
                @Override
                public void add() {

                }

                @Override
                public void remove() {

                }
            });

           component.add();
           component.remove();

    }
}
