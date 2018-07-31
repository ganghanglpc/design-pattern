package command;

/**
 * 遥控器
 */
public class RemoteControl {
    Command[] onCommands = new Command[5];
    Command[] offCommands = new Command[5];

    public void setOnCommond(Command onCommond,int i) {
        onCommands[i] = onCommond;
    }

    public void setOffCommand(Command offCommand,int i) {
        offCommands[i] = offCommand;
    }

    public void onButtonExcute(int i){
        onCommands[i].execute();
    }

    public void offButtonExcute(int i){
        offCommands[i].execute();
    }
}
