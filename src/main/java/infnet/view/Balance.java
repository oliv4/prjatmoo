package infnet.view;

import infnet.controller.AccountController;

public class Balance implements View {
    
    private AccountController accountController = new AccountController();

    public void show() {
        System.out.println(" Saldo ");
        System.out.println("Saldo atual: R$ " + accountController.getBalance());
    }
}
