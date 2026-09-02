package org.example.cpt;

public interface IDeviceFactory {
    CashDrawer getNewCashDrawer();
    CoinDispenser getNewCoinDispenser();
}
