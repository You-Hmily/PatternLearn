package org.hmily.pictureShowPattern.AdapterPattern;

public class Banner {

    private String banner;

    public Banner(String banner) {
        this.banner=banner;
    }

    public void showWithParen(){
          System.out.printf("( %s ) \n",banner);
    }


    public void showWithAster(){
        System.out.printf("* %s * \n",banner);
    }



}
