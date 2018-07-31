package state;

public class LogoutState implements State {
    Context context;

    public LogoutState(Context context) {
        this.context = context;
    }

    @Override
    public void validation() {
        System.out.println("I'm loggout");
    }
}
