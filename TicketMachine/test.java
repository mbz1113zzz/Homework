package experiment2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int selection;
        System.out.println("===============欢迎使用自动售票机===============");
        System.out.println("本机销售固定票价 2 元的车票");

        do {
            System.out.println("请选择服务...");
            System.out.println("1、投币");
            System.out.println("2、打印车票");
            System.out.println("3、找零");

            Scanner scan = new Scanner(System.in);
            selection =scan.nextInt();
            switch (selection) {
                case 1: {
                    TicketMachine.Input();
                    break;
                }
                case 2: {
                    TicketMachine.PrintTicket();
                    break;
                }
                case 3: {
                    TicketMachine.TakeChange();
                    break;
                }
                default: {
                    System.out.println("你输入的选择有误！");
                }
            }
        }while(selection!=0);
    }

}
