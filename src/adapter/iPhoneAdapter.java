package adapter;

public class iPhoneAdapter extends iPhone6s implements Android {
    @Override
    public void isAndroid() {
        isIPhone();
    }
}
