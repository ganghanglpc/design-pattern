package command;

/**
 * 开电灯命令，实现了命令接口，并持有命令接受者变量
 */
public class LightOnCommand implements Command {
    //私有化命令的接受者
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }
}
