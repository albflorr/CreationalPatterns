package org.example.cpt;

public class NCRFactory implements IDeviceFactory{
    @Override
    public CashDrawer getNewCashDrawer() {
        return new NCRDrawer();
    }

    @Override
    public CoinDispenser getNewCoinDispenser() {
        return new NCRCoinDispenser();
    }
}
