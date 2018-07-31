package state;

public class LoginState implements State {
    Context context;

    public LoginState(Context context) {
        this.context = context;
    }

    @Override
    public void validation() {
        System.out.println("I'm loggin");
    }
}
