package infnet.view;

import infnet.controller.AccountController;

public class Deposit implements View {
    
    private AccountController accountController = new AccountController();

    public void show() {
        System.out.println(" Deposito ");
    }
}
