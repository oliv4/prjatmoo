package infnet.view;

import java.util.Scanner;

import infnet.controller.HomeController;

public class Home implements View {

    private int option;
    private HomeController homeController = new HomeController();

    public void show() {
        Scanner scan = new Scanner(System.in);

        while(option <=3) {
            System.out.println( " Menu ");
            System.out.println( " 1 - Ver saldo ");
            System.out.println( " 2 - Saque ");
            System.out.println( " 3 - Deposito ");
            System.out.println( " 4 - Sair ");
            System.out.println( " Entre com a opção: ");
            
            homeController.show(option);
            this.option = scan.nextInt();
        }

        scan.close();
    }

}
