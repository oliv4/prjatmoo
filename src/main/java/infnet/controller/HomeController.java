package infnet.controller;

import infnet.view.Balance;
import infnet.view.Withdrawal;
import infnet.view.Deposit;
import infnet.view.View;

public class HomeController {

    private View view;

    public void show(int option) {
        switch (option) {
            case 1:
                view = new Balance();
                break;
            case 2:
                view = new Withdrawal();
                break;
            case 3:
                view = new Deposit();
                break;
            case 4:
                System.out.println("Desconectado com sucesso!");
                break;
            default:
            break;
        }

        view.show();
    }
}
