package org.hmily.pattern.command_and_active_object.command;

import org.hmily.pattern.command_and_active_object.active_object.ActiveOjectEngine;

public class SleepCommand implements Command{

    private long millseconds;

    private ActiveOjectEngine activeOjectEngine=null;

    private Command command;

    private long sleepTime;

    private long startTime;

    private boolean started=false;

    public SleepCommand(long millseconds, ActiveOjectEngine e, Command wakeup) {

        sleepTime=millseconds;
        activeOjectEngine=e;
        command=wakeup;
    }

    @Override
    public void excuted() {
        long currentTime=System.currentTimeMillis();
        if (!started){
            started=true;
            startTime=currentTime;
            activeOjectEngine.addCommand(this);
        }else if ((currentTime-startTime)<sleepTime){
             activeOjectEngine.addCommand(this);
        }else{
             activeOjectEngine.addCommand(command);
        }
    }

    @Override
    public void undo() {

    }
}
