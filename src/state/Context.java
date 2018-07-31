package state;

public class Context {
    LoginState loginState;
    LogoutState logoutState;
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void validation(){
        state.validation();
    }
}
