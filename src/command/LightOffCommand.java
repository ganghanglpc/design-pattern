package command;

public class LightOffCommand implements Command {
    //私有化命令的接受者
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }
}
