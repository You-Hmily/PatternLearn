package org.hmily.pictureShowPattern.AdapterPattern;

public class PrintBanner extends Print{

    private Banner banner;

    public PrintBanner(String banner) {
        this.banner = new Banner(banner);
    }

    @Override
    public void printWeak() {
      banner.showWithParen();
    }

    @Override
    public void printStrong() {
      banner.showWithAster();
    }
}
