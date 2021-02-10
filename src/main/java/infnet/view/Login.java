package infnet.view;

import java.util.Scanner;
import infnet.controller.LoginController;

public class Login implements View {
    
    private String account;
    private int pin;
    private LoginController loginController = new LoginController();

    public void show() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número da conta: ");
        account = scan.next();

        System.out.println("Informe o PIN: ");
        pin = scan.nextInt();

        loginController.login(account, pin);

        scan.close();
    }
}
