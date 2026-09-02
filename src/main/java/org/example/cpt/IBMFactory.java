package org.example.cpt;

public class IBMFactory implements IDeviceFactory{
    @Override
    public CashDrawer getNewCashDrawer() {
        return new IBMDrawer();
    }

    @Override
    public CoinDispenser getNewCoinDispenser() {
        return new IBMCoinDispenser();
    }
}
