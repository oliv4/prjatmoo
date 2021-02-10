package infnet.controller;

import infnet.model.Account;
import infnet.view.Home;

public class LoginController {
    
    private static Account account;

    public void login(String number, int pin) {
        if (!this.validate(number, pin)) {
            // exception
        }

        LoginController.account = new Account(number, pin);
        Home home = new Home();
        home.show();
    }
    
    public boolean validate(String number, int pin) {
        return number.equals("1212") && pin == 123;
    }
}
