package proxy;

public class ProxyBuyHouse implements BuyHouse {
    private ZhangsanBuyHouse zhangsanBuyHouse;

    public ProxyBuyHouse(ZhangsanBuyHouse zhangsanBuyHouse) {
        this.zhangsanBuyHouse = zhangsanBuyHouse;
    }

    @Override
    public void buyHouse() {
        //业务逻辑
        zhangsanBuyHouse.buyHouse();
        //业务逻辑
    }
}
