package org.example;

import org.example.cpt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        IDeviceFactory factory = new IBMFactory();

        factory.getNewCashDrawer();
        factory.getNewCoinDispenser();
    }
}
