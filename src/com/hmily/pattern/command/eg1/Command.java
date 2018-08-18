package com.hmily.pattern.command.eg1;

/**
 * Created by zyzhmily on 2018/8/17.
 * 命令接口
 */
public interface Command {

    void execute();

    void undo();

}
