package infnet.view;

import java.util.Scanner;

import infnet.controller.AccountController;

public class Withdrawal implements View {
    
    private AccountController accountController = new AccountController();

    public void show() {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Saque ");
        System.out.println("Saldo atual: R$ " + accountController.getBalance());
        System.out.println("Digite o valor que deseja sacar:");
        Double withdrawal = scan.nextDouble();

        if (withdrawal > accountController.getBalance()) {
            System.out.println("Valor inválido, tente novamente!");
        }

        accountController.setBalance(withdrawal);

        scan.close();
    }
}
