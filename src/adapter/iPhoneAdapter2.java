package adapter;

/**
 * 对象适配器
 */
public class iPhoneAdapter2 implements Android {
    private iPhone iPhone;

    public iPhoneAdapter2(adapter.iPhone iPhone) {
        this.iPhone = iPhone;
    }

    @Override
    public void isAndroid() {
        iPhone.isIPhone();
    }
}
