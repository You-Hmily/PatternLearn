package org.hmily.pattern.command_and_active_object.active_object;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import org.hmily.pattern.command_and_active_object.command.Command;
import org.hmily.pattern.command_and_active_object.command.SleepCommand;

public class TestSleepCommand extends TestCase {

    public static void main(String[] args) {
        TestRunner.main(new String[]{"TestSleepCommand"});
    }

    public TestSleepCommand(String name){
        super(name);
    }

    private boolean commandExecuted=false;

    public void testSleep(){
        Command wakeup =new Command(){

            @Override
            public void excuted() {
                commandExecuted=true;
            }

            @Override
            public void undo() {

            }
        };
        ActiveOjectEngine e=new ActiveOjectEngine();
        SleepCommand c=new SleepCommand(1000,e,wakeup);
        e.addCommand(c);
        long start=System.currentTimeMillis();
        e.run();
        long stop = System.currentTimeMillis();
        long sleepTime=stop-start;
        //assert("SleepTime "+sleepTime+" expected >1000",sleepTime<1000);
        //assert("SleepTime "+sleepTime+" expected >1000",sleepTime<1000);
        //assert("Command Executed",commandExecuted);
    }


}
