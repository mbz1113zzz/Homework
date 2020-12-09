package experiment2;

import java.util.Scanner;

public class TicketMachine {
    private static int count = 0;

    public static void Input(){
        System.out.println("请输入投币的金额：");
        Scanner scan = new Scanner(System.in);
        int i =scan.nextInt();
        count +=i;
        System.out.println("当前余额为："+count);
    }

    public static void PrintTicket(){
        System.out.println("========================");
        System.out.println("This is a ticket");
        System.out.println("price : 2 Yuan");
        System.out.println("========================");

        count -= 2;
        System.out.println("当前余额为："+count);
    }

    public static void TakeChange(){
        System.out.println("请收好找零"+count+"元");
        count = 0;
    }

}
